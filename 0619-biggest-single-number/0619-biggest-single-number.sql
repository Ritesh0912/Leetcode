# Write your MySQL query statement below
SELECT (SELECT num FROM MyNumbers
GROUP BY num
HAVING COUNT(num) = 1
ORDER BY num DESC LIMIT 1 ) AS num;

-- (SELECT num FROM MyNumbers
-- GROUP BY num
-- HAVING COUNT(num) = 1)

-- UNION

-- (SELECT NULL AS "NUM")
-- ORDER BY num DESC 
-- LIMIT 1;



