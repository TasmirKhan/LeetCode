CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
   declare offset_val int default N-1;
   if offset_val < 0 then
   return null;
   end if;

  RETURN (
      # Write your MySQL query statement below.

    select distinct salary
    from employee
    order by salary desc
    limit 1 offset offset_val
  );
END