# Write your MySQL query statement below
SELECT 
    st.student_id,
    st.student_name,
    ex.subject_name,
    COUNT(ex.student_id) AS attended_exams
FROM Students st
JOIN Examinations ex
ON ex.student_id = st.student_id
RIGHT JOIN Subjects su
ON su.subject_name = ex.subject_name
GROUP BY st.student_name, su.subject_name
ORDER BY st.student_id, ex.subject_name