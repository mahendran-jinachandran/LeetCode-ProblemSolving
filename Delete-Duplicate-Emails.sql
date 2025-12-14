1# Write your MySQL query statement below
2DELETE 
3    p1
4FROM
5    person as p1
6INNER JOIN
7    person as p2
8ON
9    p1.email=p2.email
10    AND
11    p1.id>p2.id