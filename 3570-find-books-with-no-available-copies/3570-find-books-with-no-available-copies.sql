# Write your MySQL query statement below
with temp as (
select book_id, count(*) as current_borrowers
from borrowing_records
where return_date is null
group by book_id
) 

select l.book_id, l.title, l.author, l.genre, l.publication_year, t.current_borrowers
from library_books l
join  temp t on
l.book_id = t.book_id
where l.total_copies = t.current_borrowers
group by book_id
order by t.current_borrowers desc, l.title asc