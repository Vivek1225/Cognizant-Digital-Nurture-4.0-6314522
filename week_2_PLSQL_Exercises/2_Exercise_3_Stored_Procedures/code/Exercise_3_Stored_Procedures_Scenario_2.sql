create or replace procedure UpdateEmployeeBonus(
    p_department in varchar2,
    p_bonus in number
) is

begin
    update Employees
    set salary = salary + (salary * P_bonus / 100)
    where Department = p_department;
    commit;
end;
/