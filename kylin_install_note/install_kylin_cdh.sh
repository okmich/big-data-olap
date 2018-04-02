wget https://archive.apache.org/dist/kylin/apache-kylin-2.3.0/apache-kylin-2.3.0-hbase1x-bin.tar.gz
# if the installation is in cloudera CDH platform, please use the commented link
# wget https://archive.apache.org/dist/kylin/apache-kylin-2.3.0/apache-kylin-2.3.0-cdh57-bin.tar.gz

tar fxvz apache-kylin-2.3.0-hbase1x-bin.tar.gz

sudo mv apache-kylin-2.3.0-bin /opt/

echo "add /opt/apache-kylin-2.3.0-bin as KYLIN_HOME and $KYLIN_HOME/bin to you $PATH in the ~/.bash_profile"

echo "export KYLIN_HOME=/opt/apache-kylin-2.3.0-bin"
echo "export PATH=$PATH:$KYLIN_HOME/bin"
