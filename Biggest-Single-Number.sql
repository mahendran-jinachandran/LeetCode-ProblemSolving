1# Write your MySQL query statement below
2SELECT MAX(num) as num
3FROM (
4    SELECT num FROM MyNumbers
5    GROUP BY num HAVING COUNT(*) = 1
6) AS t;
7