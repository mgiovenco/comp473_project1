create table facility
(
id int NOT NULL AUTO_INCREMENT,
name varchar(50) NOT NULL,
line1 varchar(50) NOT NULL,
line2 varchar(50) NULL,
city varchar(50) NOT NULL,
state varchar(50) NOT NULL,
zip varchar(50) NOT NULL,
phone varchar(50) NOT NULL,
capacity int NOT NULL,
owner text NOT NULL,
PRIMARY KEY (id)
);