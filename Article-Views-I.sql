1# Write your MySQL query statement below
2
3SELECT DISTINCT author_id as id FROM Views
4WHERE author_id = viewer_id ORDER BY author_id;