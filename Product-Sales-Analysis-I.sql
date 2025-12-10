1# Write your MySQL query statement below
2SELECT product_name, year, price FROM Sales
3LEFT JOIN Product ON Sales.product_id = Product.product_id;