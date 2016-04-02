# comp473_project2

#To connect to db
mysql -h comp473p1.c5qycvuwlvdp.us-east-1.rds.amazonaws.com -P 3306 -u mgiovenco -p

#To ssh onto server
chmod 400 mykey.pem
ssh -i "mykey.pem" ec2-user@ec2-52-91-7-159.compute-1.amazonaws.com

#To run jar
java -jar comp473_project1.jar

#To scp file to AWS
scp -i "mykey.pem" out/artifacts/comp473_project1_jar/comp473_project1.jar  ec2-user@ec2-52-91-7-159.compute-1.amazonaws.com:~