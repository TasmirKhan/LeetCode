# Write your MySQL query statement below

-- select min(id) as id, email -- why can't we directly use distince email here
-- from Person
-- group by email;


-- delete from person 
-- where id not in (
--     select id
--     from(
--         select min(id) as id -- why can't i directly use this block inside not in block
--         from person
--         group by email
--     ) as keep_ids
--     )


delete p1
from Person p1
join Person p2
on p1.email = p2.email and p1.id > p2.id

-- Approach 1: Self-join in DELETE (cleanest and avoids MySQL's Error 1093)
-- DELETE p1
-- FROM Person p1
-- JOIN Person p2
--   ON p1.email = p2.email
--  AND p1.id > p2.id;

-- Approach 2: Nested subquery with NOT IN (wraps inner SELECT so MySQL materializes it first)
-- DELETE FROM Person
-- WHERE id NOT IN (
--     SELECT id
--     FROM (
--         SELECT MIN(id) AS id
--         FROM Person
--         GROUP BY email
--     ) AS keep_ids
-- );