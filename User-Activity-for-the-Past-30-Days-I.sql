1# Write your MySQL query statement below
2SELECT
3     activity_date as day,
4    COUNT(DISTINCT user_id) as active_users
5    
6FROM Activity
7where 
8    datediff('2019-07-27', activity_date) < 30
9        and
10    activity_date <= '2019-07-27'
11GROUP BY activity_date