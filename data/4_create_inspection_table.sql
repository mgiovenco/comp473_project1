create table inspection
(
id int NOT NULL AUTO_INCREMENT,
type varchar(50) NOT NULL,
requested_datetime TIMESTAMP NOT NULL,
inspection_datetime TIMESTAMP NULL,
status varchar(50) NOT NULL,
facility_id int NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (facility_id)
REFERENCES facility(id)
ON DELETE CASCADE
);