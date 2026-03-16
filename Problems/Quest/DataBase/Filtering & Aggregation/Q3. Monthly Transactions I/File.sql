# Write your MySQL query statement below
SELECT 
    trans_date AS month,
    country AS country,
    COUNT(id) AS trans_count,
    state AS approved_count,
    amount AS trans_total_amount,
    amount AS approved_total_amount
FROM Transactions
GROUP BY country