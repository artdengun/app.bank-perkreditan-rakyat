INSERT INTO security.roles(rolename, created_by, created_date) values
('Administrator','migration',now()),
('Operator','migration',now());

INSERT INTO security.users (user_id, username, password,is_active,created_by,created_date) values
('0001','admin','admin',TRUE,'migration', now()),
('0002','dimas','dimas', FALSE , 'migration', now());

insert  into security.user_roles(user_id, role_id) values
('0001', (SELECT role_id FROM security.roles where rolename = 'Administrator')),
('0001', (SELECT  role_id FROM security.roles where rolename = 'Operator' )),
('0002', (SELECT  role_id FROM security.roles where rolename = 'Operator' ));
