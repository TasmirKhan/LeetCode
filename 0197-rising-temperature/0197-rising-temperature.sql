
select today.id
from Weather yesterday
join Weather today on
dateDiff(today.recordDate, yesterday.recordDate) = 1 and today.temperature > yesterday.temperature