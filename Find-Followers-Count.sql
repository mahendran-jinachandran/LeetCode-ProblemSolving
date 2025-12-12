1# Write your MySQL query statement below
2SELECT user_id, COUNT(DISTINCT follower_id) as followers_count
3FROM Followers
4GROUP BY user_id;