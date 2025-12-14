1# Write your MySQL query statement below
2SELECT s.user_id, ROUND(IFNULL(AVG(action = 'confirmed'), 0), 2) AS confirmation_rate
3FROM Signups s
4LEFT JOIN Confirmations c
5ON s.user_id = c.user_id
6GROUP BY user_id
7