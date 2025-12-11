1# Write your MySQL query statement below
2SELECT * FROM Cinema
3WHERE id % 2 = 1 AND description != 'boring'
4ORDER BY rating DESC;