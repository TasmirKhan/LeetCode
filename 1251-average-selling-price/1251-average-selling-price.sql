# Write your MySQL query statement below


select p.product_id, round(coalesce(sum(u.units*p.price)/sum(u.units),0),2) as average_price
from Prices p
left join UnitsSold u on
p.product_id = u.product_id and u.purchase_date between p.start_date and p.end_date
group by p.product_id





-- # Write your MySQL query statement below
-- select p.product_id, round(coalesce(sum(p.price * s.units) / sum(s.units), 0), 2) as average_price  
-- from Prices as p
-- left join UnitsSold as s 
-- on p.product_id = s.product_id and s.purchase_date between p.start_date and p.end_date 
-- group by p.product_id; 


-- select u.product_id, round(coalesce(sum(p.price*u.units)/ sum(u.units),0),2) as average_price
-- from UnitsSold u
-- join Prices p on
-- p.product_id = u.product_id and u.purchase_date between p.start_date and p.end_date
-- group by u.product_id
