create table room
(
id int NOT NULL AUTO_INCREMENT,
name varchar(50) NOT NULL,
building_id int,
PRIMARY KEY (id),
FOREIGN KEY (building_id)
REFERENCES building (id)
ON DELETE CASCADE
);