SET SERVEROUTPUT ON
BEGIN
  FOR rec IN (
    SELECT l.LOANID, l.CUSTOMERID, l.LOANAMOUNT, l.ENDDATE, c.NAME
    FROM Loans l
    JOIN Customers c ON l.CUSTOMERID = c.CUSTOMERID
    WHERE l.ENDDATE BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE(CHR(10));
    DBMS_OUTPUT.PUT_LINE('Dear ' || rec.NAME ||
                         ', this is a kind reminder that your loan with Loan ID ' || rec.LOANID ||
                         ' (Amount: $' || TO_CHAR(rec.LOANAMOUNT, '999,999.99') ||
                         ') is due on ' || TO_CHAR(rec.ENDDATE, 'DD-Mon-YYYY') ||
                         '. Please ensure timely payment. Thank you!');
    
  END LOOP;
END;
/