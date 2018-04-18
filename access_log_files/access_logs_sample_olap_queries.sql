-- return the total number of click events and the total amount of data transferred outward
select sum(size)/1048576 data_amount, count(1) clicks from clickstream

-- return the total number of click events and the total amount of data transferred outward by day
select eventmonth,  sum(size)/1048576 data_amount, count(1) clicks from clickstream
group by  eventmonth

-- return the list of resources more access by two different time point
select url, daynameofweek, eventhour, count(1) occurence from clickstream
group by  url, daynameofweek, eventhour
having count(1) > 2


-- return the various status codes and their number of occurence by time
select statuscode, count(1) occurence from clickstream
group by  statuscode


-- return the various status codes and their number of occurence by time
select eventyear, eventmonth, count(1) occurence from clickstream
where eventyear=1995
group by  eventyear, eventmonth
