1# Write your MySQL query statement below
2SELECT p.product_id, IFNULL(ROUND(SUM(p.price * u.units) / SUM(u.units), 2), 0) AS average_price
3FROM Prices  as p
4LEFT JOIN UnitsSold as u
5ON p.product_id = u.product_id
6AND u.purchase_date BETWEEN p.start_date AND p.end_date
7GROUP BY p.product_id;
8