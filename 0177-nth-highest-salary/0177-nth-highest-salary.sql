CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      Select distinct max(e1.salary) from Employee e1 where (N-1)=(select count(distinct e2.salary) from Employee e2 where e1.salary<e2.salary)
  );
END