-- SAMPLE CUBE
-- ===============
-- return the seller amount for each country
select kc.name, sum(price) total_sales FROM kylin_sales ks 
join kylin_account ka on ka.account_id = ks.seller_Id
join kylin_country kc on kc.country = ka.account_country
group by kc.name

-- return total sold and the distinct number of sellers from our cube
select part_dt, sum(price) as total_selled, count(distinct seller_id) as sellers from kylin_sales group by part_dt order by part_dt



