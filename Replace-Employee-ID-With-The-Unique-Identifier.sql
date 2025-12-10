1# Write your MySQL query statement below
2SELECT EmployeeUNI.unique_id, Employees.name FROM Employees
3LEFT JOIN EmployeeUNI ON Employees.id = EmployeeUNI.id;