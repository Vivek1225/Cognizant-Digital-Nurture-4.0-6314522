BEGIN
  FOR rec IN (
    SELECT l.LoanID, l.InterestRate
    FROM Loans l
    JOIN Customers c ON l.CustomerID = c.CustomerID
    WHERE (MONTHS_BETWEEN(SYSDATE, c.DOB) / 12) > 60
      AND l.InterestRate >= 1
  ) LOOP
    UPDATE Loans
    SET InterestRate = rec.InterestRate *0.99;
    WHERE LoanID = rec.LoanID;
  END LOOP;
  COMMIT;
END;
/