create table address
(
id int NOT NULL AUTO_INCREMENT,
line1 varchar(50) NOT NULL,
line2 varchar(50) NOT NULL,
city varchar(50) NOT NULL,
state varchar(50) NOT NULL,
zip varchar(50) NOT NULL,
phone varchar(50) NOT NULL,
facility_id int,
PRIMARY KEY (id),
FOREIGN KEY (facility_id)
REFERENCES facility (id)
);