set serveroutput on;

CREATE OR REPLACE PROCEDURE transfer_amount (
    p_from_acct IN NUMBER,
    p_to_acct   IN NUMBER,
    p_amt       IN NUMBER
) AS
    v_from_balance NUMBER;
    v_to_balance   NUMBER;
BEGIN
    -- Check if source account has sufficient balance
    SELECT balance INTO v_from_balance FROM accounts WHERE accountid = p_from_acct;
    IF v_from_balance < p_amt THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds.');
    END IF;

    -- Deduct from sender
    UPDATE accounts
    SET balance = balance - p_amt,
        lastmodified = SYSDATE
    WHERE accountid = p_from_acct;

    -- Add to receiver
    UPDATE accounts
    SET balance = balance + p_amt,
        lastmodified = SYSDATE
    WHERE accountid = p_to_acct;

    -- Insert transaction record
    INSERT INTO transactions (trans_id, acct_id, to_acct, trans_date, amt, trans_type)
    VALUES (
        trans_seq.NEXTVAL,  -- Use your sequence for trans_id
        p_from_acct,
        p_to_acct,
        SYSDATE,
        p_amt,
        'TRANSFER'
    );

    COMMIT;
END;
/