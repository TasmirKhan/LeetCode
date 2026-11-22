# Write your MySQL query statement below

with temp as (
    select turn, person_name,
    sum(weight) over (
        order by turn
        rows between unbounded preceding and current row
    ) as cum_sum    
    from Queue
)

select person_name 
from temp
where cum_sum <= 1000
order by turn desc
limit 1


