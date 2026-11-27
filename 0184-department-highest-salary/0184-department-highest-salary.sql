with ranked_emp as (
    select d.name as Department, e.name as Employee, e.salary as Salary,
    dense_rank() over(
        partition by e.departmentId
        order by e.salary desc
    ) as rnk
    from Employee e
    left join Department d on
    e.departmentId = d.id
    
)

select Department, Employee, Salary 
from ranked_emp
where rnk = 1


