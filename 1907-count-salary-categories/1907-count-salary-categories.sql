select 
'Low Salary' as category,
count(case when income < 20000 then 1 end) as accounts_count
from Accounts

union all

select
'Average Salary',
count(case when income>=20000 and income <= 50000 then 1 end) as accounts_count2

from Accounts

union all

select 
'High Salary',
count(case when income > 50000 then 1 end) as accounts_count
from Accounts


-- SELECT
--     'Low Salary' AS category,
--     COUNT(CASE WHEN income < 20000 THEN 1 END) AS accounts_count
-- FROM Accounts

-- UNION ALL

-- SELECT
--     'Average Salary',
--     COUNT(CASE WHEN income BETWEEN 20000 AND 50000 THEN 1 END)
-- FROM Accounts

-- UNION ALL

-- SELECT
--     'High Salary',
--     COUNT(CASE WHEN income > 50000 THEN 1 END)
-- FROM Accounts;