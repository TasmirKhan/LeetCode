# Write your MySQL query statement below

select c.customer_id
from Customer c
join Product p on c.product_Key = p.product_Key 
group by customer_id
having count(distinct c.product_key) = (select count(*) from Product)
