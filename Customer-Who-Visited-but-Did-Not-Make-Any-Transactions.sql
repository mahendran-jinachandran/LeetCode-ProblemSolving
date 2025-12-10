1# Write your MySQL query statement below
2
3SELECT V.customer_id, COUNT(V.visit_id) AS count_no_trans
4FROM Visits AS V LEFT JOIN Transactions as T 
5ON V.visit_id = T.visit_id
6WHERE T.transaction_id IS NULL
7GROUP BY V.customer_id;