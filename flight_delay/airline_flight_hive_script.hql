create database flight_performance;

use flight_performance;

-- create external table for airports
create external table airport_raw (
    iata string, 
    airport string, 
    city string,
    state string, 
    country string, 
    geolat float, 
    geolong float
)
row format serde 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
with serdeproperties (
   "separatorChar" = ",",
   "quoteChar"     = "\"",
   "escapeChar"    = "\\"
) 
location '/user/maria_dev/rawdata/flight_data/airports';


-- create external table for carriers
create external table carrier_raw (
    code varchar(4), 
    description varchar(30)
)
row format serde 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
with serdeproperties (
   "separatorChar" = ",",
   "quoteChar"     = "\"",
   "escapeChar"    = "\\"
)  
stored as textfile
location '/user/maria_dev/rawdata/flight_data/carriers';

-- create external table for plane information
create external table plane_raw (
    tailnum varchar(4), 
    type varchar(30),
    manufacturer string,
    issue_date varchar(16), 
    model varchar(10), 
    status varchar(10),
    aircraft_type varchar(30),
    pyear int
)
row format serde 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
with serdeproperties (
   "separatorChar" = ",",
   "quoteChar"     = "\"",
   "escapeChar"    = "\\"
)  
stored as textfile
location '/user/maria_dev/rawdata/flight_data/planes';

create external table flight_raw
  (year smallint, month tinyint, dayofmonth tinyint, dayofweek tinyint,
  deptime smallint, crsdeptime smallint, arrtime smallint, crsarrtime smallint, 
  uniquecarrier string, flightnum string, tailnum string, actualelapsedtime smallint,
  crselapsedtime smallint, airtime smallint, arrdelay smallint, depdelay smallint, 
  origin string, dest string, distance smallint, taxiin string, taxiout string,
  cancelled string, cancellationcode string, diverted string, carrierdelay smallint,
  weatherdelay smallint, nasdelay smallint, securitydelay smallint, lateaircraftdelay smallint)
row format delimited
fields terminated by ','
location '/user/maria_dev/rawdata/flight_data/flights';

CREATE TABLE airport stored AS orc AS
SELECT iata,
       airport,
       city,
       STATE,
       country,
       geolat,
       geolong
FROM airport_raw
WHERE iata <> 'iata';

CREATE TABLE plane stored AS orc AS
SELECT tailnum,
       TYPE,
       manufacturer,
       issue_date,
       model,
       status,
       aircraft_type,
       pyear
FROM plane_raw
WHERE TYPE <> 'type';


CREATE TABLE carrier stored AS orc AS
SELECT code,
       description
FROM carrier_raw
WHERE code <> 'code';

CREATE TABLE flight stored AS orc AS
SELECT YEAR as flight_year,
       CASE
           WHEN MONTH >= 1
                AND MONTH <= 3 THEN '1'
           WHEN MONTH > 3
                AND MONTH <= 6 THEN '2'
           WHEN MONTH > 6
                AND MONTH <= 9 THEN '3'
           WHEN MONTH > 9
                AND MONTH <= 12 THEN '4'
       END AS flight_quarter,
       MONTH as flight_month,
       CASE
           WHEN MONTH = 1 THEN 'January'
           WHEN MONTH = 2 THEN 'February'
           WHEN MONTH = 3 THEN 'March'
           WHEN MONTH = 4 THEN 'Apri'
           WHEN MONTH = 5 THEN 'May'
           WHEN MONTH = 6 THEN 'June'
           WHEN MONTH = 7 THEN 'July'
           WHEN MONTH = 8 THEN 'August'
           WHEN MONTH = 9 THEN 'September'
           WHEN MONTH = 10 THEN 'October'
           WHEN MONTH = 11 THEN 'November'
           WHEN MONTH = 12 THEN 'December'
       END AS monthname,
       dayofmonth,
       dayofweek,
       CASE
           WHEN dayofweek = 1 THEN 'Monday'
           WHEN dayofweek = 2 THEN 'Tuesday'
           WHEN dayofweek = 3 THEN 'Wednesday'
           WHEN dayofweek = 4 THEN 'Thursday'
           WHEN dayofweek = 5 THEN 'Friday'
           WHEN dayofweek = 6 THEN 'Saturday'
           WHEN dayofweek = 7 THEN 'Sunday'
       END AS daynameofweek,
       to_date(concat(YEAR, '-' , MONTH, '-' , dayofmonth)) AS flight_date,
       arrdelay,
       depdelay,
       distance,
       taxiin,
       taxiout,
       cancelled,
       cancellationcode,
       diverted,
       carrierdelay,
       weatherdelay,
       nasdelay,
       securitydelay,
       lateaircraftdelay,
       uniquecarrier,
       tailnum,
       origin,
       dest
FROM flight_raw
WHERE flightnum <> 'FlightNum';


CREATE TABLE flat_flight_data stored AS orc AS
SELECT flight_year,
       flight_quarter,
       flight_month,
       monthname,
       dayofmonth,
       dayofweek,
       daynameofweek,
       arrdelay,
       depdelay,
       distance,
       taxiin,
       taxiout,
       cancelled,
       cancellationcode,
       diverted,
       carrierdelay,
       weatherdelay,
       nasdelay,
       securitydelay,
       lateaircraftdelay,
       uniquecarrier AS carrier_code,
       cr.description AS carrier,
       origin,
       orw.airport AS origin_airport,
       orw.city AS origin_city,
       orw.state AS origin_state,
       orw.country AS origin_country,
       dest,
       ar.airport AS dest_airport,
       ar.city AS dest_city,
       ar.state AS dest_state,
       ar.country AS dest_country,
       f.tailnum,
       pr.type AS ownership_type,
       pr.aircraft_type,
       pr.manufacturer AS plane_maker,
       pr.model AS plane_model,
       pr.status AS plane_status,
       pr.pyear AS plane_year
FROM flight f 
LEFT JOIN carrier cr ON cr.code = f.uniquecarrier
LEFT JOIN plane pr ON pr.tailnum = f.tailnum
LEFT JOIN airport orw ON orw.iata = f.origin
LEFT JOIN airport ar ON ar.iata = f.dest;




drop table flight_raw;
drop table airport_raw;
drop table carrier_raw;
drop table plane_raw;
