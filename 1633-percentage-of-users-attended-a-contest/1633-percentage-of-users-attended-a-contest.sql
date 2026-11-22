# Write your MySQL query statement below

select r.contest_id, round((count(r.user_id)/(select count(*) from Users))*100,2) as percentage
from Users u 
join Register r on u.user_id = r.user_id
group by r.contest_id
order by percentage desc, contest_id










-- select distinct r.contest_id, round(count(r.contest_id)/(select count(*) from Users)*100,2) as percentage
-- from Register r
-- join Users u on 
-- u.user_id = r.user_id
-- group by r.contest_id 
-- order by percentage desc, contest_id;




-- # Write your MySQL query statement below
-- SELECT
--     r.contest_id,
--     -- Divide by total users across the entire Users table (not grouped per contest) and convert to % (* 100)
--     ROUND(
--         (COUNT(DISTINCT r.user_id) / (SELECT COUNT(*) FROM Users)) * 100,
--         2
--     ) AS percentage
-- FROM Register AS r
-- -- Removed DISTINCT (redundant with GROUP BY) and removed JOIN Users (not needed when reading total count from Users)
-- GROUP BY r.contest_id
-- ORDER BY percentage DESC, r.contest_id ASC;