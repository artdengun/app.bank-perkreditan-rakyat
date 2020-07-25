insert into master_provinsi(kode_provinsi, nama_provinsi, created_date, created_by)
VALUES
('001', 'Jawa Barat', now(), 'migration'),
('002', 'Jawa Timur', now(), 'deni');

insert into master_kotakabupaten(kode_kotakabupaten, nama_kotakabupaten, created_date, created_by, provinsi_id)
VALUES
('001', 'Jakarta', now(), 'admin', '001'),
('002', 'Jember', now(), 'user', '002');