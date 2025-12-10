1# Write your MySQL query statement below
2SELECT w1.id
3FROM Weather AS w1
4LEFT JOIN Weather AS w2
5ON DATEDIFF(w1.recordDate, w2.recordDate) = 1
6WHERE w1.temperature > w2.temperature;
7
8