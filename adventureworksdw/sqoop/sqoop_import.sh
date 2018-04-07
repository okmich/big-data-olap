echo "===>>> import fact table internet sales"
sqoop-import --connect jdbc:mysql://sandbox-hdp.hortonworks.com:3306/adventureworksdw --username root --driver com.mysql.jdbc.Driver --table factinternetsales --as-parquetfile --password-file /user/maria_dev/passwordfile -m 1 --target-dir /user/maria_dev/adventureworks/dw/internetsales

echo "===>>> import dimension table customer"
sqoop-import --connect jdbc:mysql://sandbox-hdp.hortonworks.com:3306/adventureworksdw --username root --driver com.mysql.jdbc.Driver --table dimcustomer --as-parquetfile --password-file /user/maria_dev/passwordfile -m 1 --target-dir /user/maria_dev/adventureworks/dw/customer

echo "===>>> import dimension table currency"
sqoop-import --connect jdbc:mysql://sandbox-hdp.hortonworks.com:3306/adventureworksdw --username root --driver com.mysql.jdbc.Driver --table dimcurrency --as-parquetfile --password-file /user/maria_dev/passwordfile -m 1 --target-dir /user/maria_dev/adventureworks/dw/dimcurrency

echo "===>>> import dimension table date"
sqoop-import --connect jdbc:mysql://sandbox-hdp.hortonworks.com:3306/adventureworksdw --username root --driver com.mysql.jdbc.Driver --table dimdate --as-parquetfile  --password-file /user/maria_dev/passwordfile -m 1 --target-dir /user/maria_dev/adventureworks/dw/dimdate

echo "===>>> import dimension sales territory table"
sqoop-import --connect jdbc:mysql://sandbox-hdp.hortonworks.com:3306/adventureworksdw --username root --driver com.mysql.jdbc.Driver --table dimsalesterritory --as-parquetfile --password-file /user/maria_dev/passwordfile -m 1 --target-dir /user/maria_dev/adventureworks/dw/dimsalesterritory

echo "===>>> import dimension product table"
sqoop-import --connect jdbc:mysql://sandbox-hdp.hortonworks.com:3306/adventureworksdw --username root --driver com.mysql.jdbc.Driver --table dimproduct --as-parquetfile --password-file /user/maria_dev/passwordfile -m 1 --target-dir /user/maria_dev/adventureworks/dw/product

echo "===>>> import dimension geography table"
sqoop-import --connect jdbc:mysql://sandbox-hdp.hortonworks.com:3306/adventureworksdw --username root --driver com.mysql.jdbc.Driver --table dimgeography --as-parquetfile  --password-file /user/maria_dev/passwordfile -m 1 --target-dir /user/maria_dev/adventureworks/dw/dimgeography


echo "===>>> import dimension product category table"
sqoop-import --connect jdbc:mysql://sandbox-hdp.hortonworks.com:3306/adventureworksdw --username root --driver com.mysql.jdbc.Driver --table dimproductcategory --as-parquetfile --password-file /user/maria_dev/passwordfile -m 1 --target-dir /user/maria_dev/adventureworks/dw/dimproductcategory

echo "===>>> import dimension product sub category table"
sqoop-import --connect jdbc:mysql://sandbox-hdp.hortonworks.com:3306/adventureworksdw --username root --driver com.mysql.jdbc.Driver --table dimproductsubcategory --as-parquetfile --password-file /user/maria_dev/passwordfile -m 1 --target-dir /user/maria_dev/adventureworks/dw/dimproductsubcategory


