# Write your MySQL query statement below
select user_id, email
from Users
where email in(
    select email 
    from Users
    where regexp_like(email,'^[a-zA-Z0-9_]+@[a-zA-Z]+\\.com$','c')
)
order by user_id