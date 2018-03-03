wget http://www-us.apache.org/dist/kylin/apache-kylin-2.2.0/apache-kylin-2.2.0-bin-cdh57.tar.gz 

tar fxvz apache-kylin-2.2.0-bin-cdh57.tar.gz 

sudo mv apache-kylin-2.2.0-bin /opt/

echo "add /opt/apache-kylin-2.2.0-bin as KYLIN_HOME and $KYLIN_HOME/bin to you $PATH in the ~/.bash_profile"

echo "export KYLIN_HOME=/opt/apache-kylin-2.2.0-bin"
echo "export PATH=$PATH:$KYLIN_HOME/bin"
