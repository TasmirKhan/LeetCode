# Write your MySQL query statement below

-- select distinct a.num as ConsecutiveNums
-- from Logs a
-- join Logs b on a.id + 1 = b.id
-- join Logs c on a.id + 2 = c.id
-- where a.num = b.num and b.num = c.num
with temp as (
    select id,
    num,
    lag(num,1) over (order by id) as prev1,
    lag(num,2) over (order by id) as prev2
    from Logs
)
select distinct num as ConsecutiveNums
from temp
where num = prev1 and num = prev2