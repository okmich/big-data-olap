-- return a count of plane with distinct combinations of aircraft_type, manufacturer, type, model
select manufacturer, aircraft_type, model, count(1) no_of_planes from plane
group by  manufacturer, aircraft_type, model;

-- return the total distance covered by flights, max, min and average flight delay records by carrier by month
select flight_year, flight_quarter, flight_month, c.description as carrier, sum(distance) total_distance, max(depdelay) max_depdelay, min(depdelay) min_depdelay, sum(depdelay)/count(1) as avg_depdelay
from flight f
left join carrier c on c.code = f.uniquecarrier
group by flight_year, flight_quarter, flight_month, c.description;

-- for all carriers return the max, min and average flight delay for each day of the week 
select c.description carrier, f.dayofweek, max(f.depdelay) max_dep_delay, min(f.depdelay) min_dep_delay, avg(f.depdelay) avg_dep_delay from flight f
join carrier c on c.code = f.uniquecarrier
group by c.description, f.dayofweek

-- compare the flight delay values for "Fixed Wing Single-Engine" and "Fixed Wing Multi-Engine" plane air_craft type for each carrier
select c.description carrier, p.aircraft_type, max(f.depdelay) max_dep_delay, min(f.depdelay) min_dep_delay, avg(f.depdelay) avg_dep_delay, count(1) no_flight from flight f
join carrier c on c.code = f.uniquecarrier
left join plane p on p.tailnum = f.tailnum
where p.aircraft_type = 'Fixed Wing Single-Engine' OR p.aircraft_type = 'Fixed Wing Multi-Engine'
group by c.description, p.aircraft_type

-- compare the flight delay values for "Fixed Wing Single-Engine" and "Fixed Wing Multi-Engine" plane types for each airports for each carrier
select c.description carrier, p.aircraft_type, concat(concat(concat(a.airport, ', '), a.city), concat(', ', a.state)) departure,  max(f.depdelay) max_dep_delay, min(f.depdelay) min_dep_delay, avg(f.depdelay) avg_dep_delay, count(1) no_flight from flight f
join carrier c on c.code = f.uniquecarrier
left join plane p on p.tailnum = f.tailnum
join airport a on a.iata = f.origin
where p.aircraft_type = 'Fixed Wing Single-Engine' OR p.aircraft_type = 'Fixed Wing Multi-Engine'
group by c.description, p.aircraft_type, a.airport, a.city, a.state

-- return the top 10 airports with the least flight delay amongst them


-- return the top 10 airports with the least flight delay amongst them for each month of the year of 2011


-- return the top 10 airports with the least flight delay amongst them for each month of the year of 2011 by their carriers


