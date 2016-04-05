create table maintenance_schedule
(
id int NOT NULL AUTO_INCREMENT,
start_datetime TIMESTAMP NOT NULL,
end_datetime TIMESTAMP NOT NULL,
status varchar(50) NOT NULL,
maintenance_id int NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (maintenance_id) REFERENCES maintenance(id)
);