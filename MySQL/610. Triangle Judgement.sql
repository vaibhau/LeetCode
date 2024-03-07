// Solution 1

SELECT x,y,z,
CASE
    WHEN x+y > z AND y+z > x AND x+z > y THEN 'Yes'
    ELSE 'No'
END AS triangle
FROM Triangle;

// Solution 2

SELECT *,
CASE
    WHEN x+y > z AND y+z > x AND x+z > y THEN 'Yes'
    ELSE 'No'
END AS triangle
FROM Triangle;
