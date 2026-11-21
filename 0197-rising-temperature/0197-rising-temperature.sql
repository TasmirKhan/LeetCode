
select today.id
from Weather yesterday
cross join Weather today on
dateDiff(today.recordDate, yesterday.recordDate) = 1 and today.temperature > yesterday.temperature