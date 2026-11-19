-- select today.id
-- from Weather as yesterday
-- cross join Weather as today

-- where datediff(today.recordDate, yesterday.recordDate) = 1 and today.temperature > yesterday.temperature;

select w1.id
from Weather w1
left join Weather w2
on datediff(w1.recordDate , w2.recordDate) = 1 where w1.temperature > w2.temperature;
