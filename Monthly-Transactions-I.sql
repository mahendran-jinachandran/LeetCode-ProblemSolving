1# Write your MySQL query statement below
2SELECT  
3     DATE_FORMAT(trans_date, '%Y-%m') AS month,
4     country, 
5     COUNT(id) AS trans_count,
6     SUM(CASE WHEN state='approved' THEN 1 ELSE 0 END) AS approved_count,
7     SUM(amount)  AS trans_total_amount,
8     SUM(CASE WHEN state='approved' THEN amount ELSE 0 END) AS approved_total_amount
9FROM Transactions
10GROUP BY month, country