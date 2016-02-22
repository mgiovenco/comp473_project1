create table facility_problem
(
id int NOT NULL AUTO_INCREMENT,
problem_description varchar(255) NOT NULL,
repair_cost numeric(15,2),
status varchar(50) NOT NULL,
facility_id int,
PRIMARY KEY (id),
FOREIGN KEY (facility_id)
REFERENCES facility(id)
ON DELETE CASCADE
);