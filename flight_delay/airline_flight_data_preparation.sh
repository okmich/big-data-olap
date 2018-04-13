echo "===> download the data from the internet"
wget http://stat-computing.org/dataexpo/2009/carriers.csv
wget http://stat-computing.org/dataexpo/2009/airports.csv
wget http://stat-computing.org/dataexpo/2009/plane-data.csv
wget http://stat-computing.org/dataexpo/2009/2001.csv.bz2

echo "=====>>> extracting the flight data"
bzip2 -d 2001.csv.bz2

echo "=====>>> creating hdfs folders for raw data"
hdfs dfs -mkdir -p /user/maria_dev/rawdata/flight_data/flights
hdfs dfs -mkdir -p /user/maria_dev/rawdata/flight_data/airports
hdfs dfs -mkdir -p /user/maria_dev/rawdata/flight_data/carriers
hdfs dfs -mkdir -p /user/maria_dev/rawdata/flight_data/planes

echo "====>>> copy the local files to hdfs"
hdfs dfs -moveFromLocal 2001.csv /user/maria_dev/rawdata/flight_data/flights
hdfs dfs -moveFromLocal carriers.csv /user/maria_dev/rawdata/flight_data/carriers
hdfs dfs -moveFromLocal airports.csv /user/maria_dev/rawdata/flight_data/airports
hdfs dfs -moveFromLocal plane-data.csv /user/maria_dev/rawdata/flight_data/planes
