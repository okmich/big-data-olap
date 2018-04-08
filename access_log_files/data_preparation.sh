wget http://ita.ee.lbl.gov/traces/NASA_access_log_Jul95.gz
wget http://ita.ee.lbl.gov/traces/NASA_access_log_Aug95.gz 

mkdir /home/maria_dev/access_logs

gunzip NASA_access_log_Jul95.gz
gunzip NASA_access_log_Aug95.gz 

mv NASA_access_log_Jul95 /home/maria_dev/access_logs/
mv NASA_access_log_Aug95 /home/maria_dev/access_logs/
