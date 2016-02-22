create table maintenance
(
id int NOT NULL AUTO_INCREMENT,
maintenance_description varchar(255) NOT NULL,
last_occurence_datetime TIMESTAMP NULL,
maintenance_cost numeric(15,2),
status varchar(50) NOT NULL,
recommended_occurence_rate varchar(50) NOT NULL,
facility_id int NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (facility_id)
REFERENCES facility(id)
ON DELETE CASCADE
);