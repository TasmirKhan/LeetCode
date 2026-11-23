# Write your MySQL query statement below

with temp as(
    select id,
    student,
    case when (id%2 = 0) then lag(id,1,id) over (order by id)
         else lead(id,1,id) over(order by id)
    end as swap_id
    from Seat
    order by id
)

select swap_id as id, student
from temp
order by swap_id