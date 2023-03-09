-- 코드를 입력하세요
SELECT CAR_ID, ROUND(AVG(END_DATE-START_DATE)+1,1) AS AVERAGE_DURATION 
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
HAVING ROUND(AVG(END_DATE-START_DATE),2) > 6
GROUP BY CAR_ID
ORDER BY AVERAGE_DURATION DESC, CAR_ID DESC

-- SELECT * FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY ORDER BY CAR_ID 

