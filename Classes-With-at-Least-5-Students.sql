1# Write your MySQL query statement below
2SELECT class FROM Courses
3GROUP BY class HAVING COUNT(class) > 4;