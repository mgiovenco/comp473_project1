create table building
(
id int NOT NULL AUTO_INCREMENT,
name varchar(50) NOT NULL,
facility_id int,
PRIMARY KEY (id),
FOREIGN KEY (facility_id)
REFERENCES facility(id)
ON DELETE CASCADE
);