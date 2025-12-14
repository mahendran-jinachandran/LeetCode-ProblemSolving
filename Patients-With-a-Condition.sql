1# Write your MySQL query statement below
2SELECT patient_id, patient_name, conditions
3FROM Patients
4WHERE conditions LIKE 'DIAB1%' or conditions LIKE '% DIAB1%';