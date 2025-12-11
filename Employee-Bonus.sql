1# Write your MySQL query statement below
2SELECT name, bonus 
3FROM Employee
4LEFT JOIN Bonus
5ON Employee.empId = Bonus.empId
6WHERE bonus < 1000 or bonus IS NULL; 