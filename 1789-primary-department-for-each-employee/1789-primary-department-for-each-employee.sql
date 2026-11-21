-- # Write your MySQL query statement below

-- select employee_id, department_id
-- from Employee
-- where primary_flag = 'Y'
-- group by employee_id
-- having count(department_id) = 1;


    -- select e1.employee_id, e1.department_id
    -- from Employee e1
    -- join Employee e2
    -- on e1.employee_id = e2.employee_id
    -- group by employee_id
    -- having count(e1.primary_flag) = 1
    -- order by employee_id


select employee_id, department_id
from Employee
where primary_flag = 'Y'
union
select employee_id, department_id
from Employee
group by employee_id
having count(*) = 1;