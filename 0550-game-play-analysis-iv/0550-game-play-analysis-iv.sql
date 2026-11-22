-- # Write your MySQL query statement below

select round(
    count(distinct player_id)/(select count( distinct player_id) from Activity)
,2) as fraction
from Activity
where(player_id,event_date) in(
    select player_id, date_add(min(event_date), interval 1 day)
    from Activity
    group by player_id
)


-- select round(
--     count(player_id) * 100 / (select count(*) from Activity group by player_id)
--     ,2) as fraction
-- from Activity
-- where(player_id, event_date) in(
--     select a.player_id, a.event_date
--     from Activity a
--     join Activity b on a.player_id = b.player_id
--     group by a.player_id 
--     having dateDiff(min(a.event_date), a.event_date) = 1
    
-- )