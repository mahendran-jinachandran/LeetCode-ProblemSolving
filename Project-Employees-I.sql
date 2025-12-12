1# Write your MySQL query statement below
2SELECT project_id, ROUND(AVG(e.experience_years),2) AS average_years
3FROM Project as p
4LEFT JOIN Employee as e
5ON p.employee_id = e.employee_id
6GROUP BY project_id;