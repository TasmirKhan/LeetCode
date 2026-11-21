# Write your MySQL query statement below

select(
    select m.num
    from MyNumbers as m
    group by m.num
    having count(m.num) = 1
    order by m.num desc 
    limit 1
) as num;