# Write your MySQL query statement below
select p.project_id, round(sum(e.experience_years)/count(p.employee_id), 2) as average_years
from Project as p
left join Employee as e
on p.employee_id = e.employee_id
group by p.project_id


# Write your MySQL query statement below
-- SELECT
--     p.project_id,
--     -- Removed extra '(' after ROUND and used AVG() to ignore NULLs properly
--     ROUND(AVG(e.experience_years), 2) AS average_years
-- FROM Project AS p
-- -- LEFT JOIN keeps every project even if an employee match or experience_years is NULL
-- LEFT JOIN Employee AS e
--     ON p.employee_id = e.employee_id
-- GROUP BY p.project_id;