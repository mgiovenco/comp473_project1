create table inspection
(
id int NOT NULL AUTO_INCREMENT,
type varchar(50) NOT NULL,
requestedDate DATE NOT NULL,
inspectionDate DATE NULL,
status varchar(50) NOT NULL,
facility_id int NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (facility_id)
REFERENCES facility(id)
ON DELETE CASCADE
);