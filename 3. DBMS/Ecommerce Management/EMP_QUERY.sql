
use prathap1;

SELECT employee.ename, departments.dname
FROM employee
INNER JOIN departments
ON employee.dep=departments.did;﻿
 


Select departments.dname, subjects.sid 
from departments left join subjects
 on departments.did = subjects.dep order by departments.dname;
 
