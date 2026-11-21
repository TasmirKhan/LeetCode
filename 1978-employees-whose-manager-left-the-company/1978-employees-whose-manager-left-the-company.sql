# Write your MySQL query statement below

select employee_id 
from Employees
where salary < 30000 and
manager_id is Not null
and manager_id not in(
    select employee_id
    from Employees
    where employee_id is not null
)
order by employee_id


-- select employee_id 
-- from Employees
-- where salary < 30000 

-- intersect

-- select employee_id
-- from Employees 
-- group by employee_id
-- having manager_id not in employee_id


