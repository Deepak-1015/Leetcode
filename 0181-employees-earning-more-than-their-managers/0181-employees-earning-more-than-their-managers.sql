# Write your MySQL query statement below
select e.name as employee from employee e join employee e2 on e.managerid=e2.id
where e.salary>e2.salary;