1# Write your MySQL query statement below
2SELECT
3    ROUND(SUM(IF(order_date = customer_pref_delivery_date, 1, 0))*100/COUNT(DISTINCT customer_id),2) AS immediate_percentage
4FROM Delivery 
5WHERE(customer_id, order_date) IN
6    (SELECT
7    customer_id, MIN(order_date) AS first_order_date
8    FROM Delivery
9    GROUP BY customer_id)