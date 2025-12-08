1# Write your MySQL query statement below
2SELECT Employee.name, Bonus.bonus 
3FROM Employee LEFT JOIN Bonus ON Employee.empId = Bonus.empId
4WHERE bonus < 1000 OR bonus is null; 