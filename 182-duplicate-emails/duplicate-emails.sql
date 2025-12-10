# Write your MySQL query statement below
Select email  from Person Group By email Having Count(email)>1;