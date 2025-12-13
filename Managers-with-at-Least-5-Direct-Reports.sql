1# Write your MySQL query statement below
2SELECT e1.name
3FROM Employee e1
4JOIN Employee e2
5ON e1.id = e2.managerID
6GROUP BY e1.id, e1.name
7HAVING count(e1.id) >= 5