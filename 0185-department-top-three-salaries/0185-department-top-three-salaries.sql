# Write your MySQL query statement below

with temp as(
    select e.id, e.name as Employee ,e.salary as Salary ,d.name as Department,
    DENSE_RANK() over(
        partition by d.name
        order by salary desc
    ) as rnk
    from Employee e
    join Department d on e.departmentId = d.id
    order by Department,e.salary desc
)



select Department, Employee, Salary 
from temp
where rnk <= 3
