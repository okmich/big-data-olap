-- return the total number of click events and the total amount of data transferred outward
select sum(size)/1048576 data_amount, count(1) clicks from log_table

-- return the total number of click events and the total amount of data transferred outward by day
select monthname,  sum(size)/1048576 data_amount, count(1) clicks from log_table
group by  monthname

-- return the list of resources more access by two different time point
select url, day_start, hour_start , count(1) occurence from log_table_1
group by  url, day_start, hour_start
having count(1) > 2


-- return the various status codes and their number of occurence by time
select statuscode, count(1) occurence from log_table_1
group by  statuscode
