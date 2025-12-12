1# Write your MySQL query statement below
2SELECT query_name, 
3round(avg(cast(rating as decimal) / position), 2) as quality,
4round(sum(case when rating < 3 then 1 else 0 end) * 100 / count(*), 2) as poor_query_percentage
5FROM Queries
6GROUP BY query_name