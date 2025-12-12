1SELECT teacher_id, COUNT(DISTINCT subject_id) as cnt
2FROM Teacher
3GROUP BY teacher_id;