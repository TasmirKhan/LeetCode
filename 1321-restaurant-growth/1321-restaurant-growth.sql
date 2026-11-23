-- # Write your MySQL query statement below

with daily as(
    select visited_on,
    sum(amount) as daily_amount
    from Customer
    group by visited_on
),

temp as (
    select visited_on,
    sum(daily_amount) over(
        order by visited_on
        rows between 6 preceding and current row
    )as amount 
    from daily
)

select visited_on,
       amount,
       round(amount/7,2) as average_amount
       from temp
       where visited_on >=(
        select DATE_ADD(min(visited_on), interval 6 day)
        from customer
       )
       order by visited_on

--     select visited_on, 
--     sum(amount) over(
--         order by visited_on
--         rows between 6 preceding and current row
--     ) as amount,
--     round(amount/7,2) as average_amount

--     from Customer
--     where rows >= 7
--     group by visited_on
--     order by visited_on
