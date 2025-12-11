1# Write your MySQL query statement below
2
3-- select a.machine_id, round(avg((b.timestamp  - a.timestamp)),3) as processing_time 
4-- from activity a
5-- inner join activity b
6-- on a.machine_id = b.machine_id
7-- and a.process_id = b.process_id
8-- and a.activity_type != b.activity_type
9-- and a.activity_type = 'start'
10-- group by a.machine_id;
11
12SELECT a.machine_id, round(avg((b.timestamp  - a.timestamp)),3) as processing_time 
13FROM Activity a
14INNER JOIN Activity b
15on a.machine_id = b.machine_id
16and a.process_id = b.process_id
17and a.activity_type != b.activity_type
18and a.activity_type = 'start'
19GROUP BY a.machine_id