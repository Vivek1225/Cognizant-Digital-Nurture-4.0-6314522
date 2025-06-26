CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE Accounts
  SET Balance = Balance * 1.01,
      LastModified = SYSDATE
  WHERE AccountType = 'Savings';

  COMMIT;
END;
/