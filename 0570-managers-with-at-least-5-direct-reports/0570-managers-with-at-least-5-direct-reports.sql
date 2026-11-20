# Write your MySQL query statement below

select e.name
from employee as e
inner join Employee as m on e.id = m.managerId
group by m.managerId
having count(m.managerId) >= 5;

-- select name from employee
-- where id in (
--     select managerId
--     from employee
--     group by managerId
--     having count(*) >= 5
-- );

-- failed full join approach
-- select e1.name
-- from Employee e1
-- join Employee e2
-- on e1.id = e2.id and e1.managerId = e2.managerId
-- where count(e2.managerId) >= 5 
-- group by e1.id;
