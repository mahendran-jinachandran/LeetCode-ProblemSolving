# Write your MySQL query statement below
SELECT c.name as Customers 
from customers as c
left join Orders as o
on c.id = o.customerId
where o.customerId is null;