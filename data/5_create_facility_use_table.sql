create table facility_use
(
id int NOT NULL AUTO_INCREMENT,
start_datetime TIMESTAMP NOT NULL,
end_datetime TIMESTAMP NOT NULL,
cust_id int NOT NULL,
status varchar(50) NOT NULL,
facility_id int NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (facility_id) REFERENCES facility(id),
FOREIGN KEY (cust_id) REFERENCES customer(id)
ON DELETE CASCADE
);