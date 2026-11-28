with rankScores as(
    select student_id, subject, score,
    first_value(score) over(
        partition by student_id,subject
        order by exam_date asc
    ) as fvalue,
    first_value(score) over(
        partition by student_id, subject
        order by exam_date desc
    ) as lvalue

    from Scores
)

select student_id, subject, max(fvalue) as first_score, max(lvalue) as latest_score
from rankScores
group by student_id, subject
having count(*) >= 2 and max(lvalue) > max(fvalue)
order by student_id
