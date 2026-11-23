# Write your MySQL query statement below

(select u.name as results
from Users u left join 
MovieRating r on u.user_id = r.user_id
group by u.user_id
order by count(u.user_id) desc, min(u.name)
limit 1)

union all
(
select m.title as results
from Movies as m
left join MovieRating as r on
m.movie_id = r.movie_id and created_at between '2020-02-01' and '2020-02-29'
group by m.movie_id
order by avg(r.rating) desc, min(m.title)
limit 1

)