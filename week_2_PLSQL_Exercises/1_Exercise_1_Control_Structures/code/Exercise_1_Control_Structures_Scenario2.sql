BEGIN
  FOR rec IN (SELECT customerid, balance FROM customers) LOOP
    IF rec.balance > 10000 THEN
      UPDATE customers
      SET IsVIP = 'TRUE'
      WHERE customerid = rec.customerid;
    END IF;
  END LOOP;
  COMMIT;
END;
/