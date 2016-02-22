create table maintenance_request
(
id int NOT NULL AUTO_INCREMENT,
maintenance_description varchar(255) NOT NULL,
requested_datetime TIMESTAMP NOT NULL,
maintenance_cost numeric(15,2),
status varchar(50) NOT NULL,
facility_id int NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (facility_id)
REFERENCES facility(id)
ON DELETE CASCADE
);