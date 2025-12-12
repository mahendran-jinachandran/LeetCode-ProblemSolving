1# Write your MySQL query statement below
2SELECT contest_id, ROUND(COUNT(DISTINCT u.user_id)*100 / (SELECT COUNT(*) FROM users),2) AS percentage
3FROM Users as u
4JOIN Register as r
5ON u.user_id = r.user_id
6GROUP BY r.contest_id
7ORDER BY percentage DESC, r.contest_id ASC;