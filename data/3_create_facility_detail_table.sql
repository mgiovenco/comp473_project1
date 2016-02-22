create table facility_detail
(
id int NOT NULL AUTO_INCREMENT,
detail varchar(255) NOT NULL,
facility_id int,
PRIMARY KEY (id),
FOREIGN KEY (facility_id)
REFERENCES facility(id)
ON DELETE CASCADE
);