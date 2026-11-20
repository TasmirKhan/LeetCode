# Write your MySQL query statement below

select name from employee
where id in (
    select managerId
    from employee
    group by managerId
    having count(*) >= 5
);

-- failed full join approach
-- select e1.name
-- from Employee e1
-- join Employee e2
-- on e1.id = e2.id and e1.managerId = e2.managerId
-- where count(e2.managerId) >= 5 
-- group by e1.id;
