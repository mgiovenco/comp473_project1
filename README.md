# comp473_project1

mysql -h comp473p1.c5qycvuwlvdp.us-east-1.rds.amazonaws.com -P 3306 -u mgiovenco -p

mysql> insert into facility (id, name) values (2, '2');

mysql> insert into building (id, name, facility_id) values (1, '1', 1);

mysql> insert into building (id, name, facility_id) values (2, '2', 1);

mysql> insert into room (id, name, building_id) values (1, '1', 1);

mysql> insert into room (id, name, building_id) values (2, '2', 1);

mysql> insert into room (id, name, building_id) values (3, '3', 2);


insert into inspection (type, requested_datetime, inspection_datetime, status, facility_id) values ("STATE", now(), now() + 1, "PASSED", 1);