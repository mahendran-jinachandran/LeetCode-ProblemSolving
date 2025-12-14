1# Write your MySQL query statement below
2SELECT s.student_id, 
3       s.student_name, 
4       sub.subject_name, 
5       COUNT(e.subject_name) as attended_exams
6FROM Students s
7JOIN Subjects sub
8LEFT JOIN Examinations e
9ON s.student_id = e.student_id AND sub.subject_name = e.subject_name
10GROUP BY s.student_id, sub.subject_name
11ORDER BY s.student_id , sub.subject_name; 