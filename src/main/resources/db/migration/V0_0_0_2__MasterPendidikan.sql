create table master_pendidikan(
kode_pendidikan CHARACTER VARYING(50) not null unique primary key,
nama_pendidikan CHARACTER VARYING(50) not null,
created_date TIMESTAMP,
created_by CHARACTER VARYING(50) not null
);
INSERT INTO master_pendidikan(kode_pendidikan, nama_pendidikan, created_date, created_by)
VALUES ('SD', 'SEKOLAH DASAR', now(), 'ADMIN'),
('SMP', 'SEKOLAH MENENGAH PERTAMA', now(), 'deni'),
('SMA', 'SEKOLAH MENENGAH ATAS', now(), 'deni'),
('SMK', 'SEKOLAH MENENGAH KEJURUAN', now(), 'deni'),
('S1', 'SARJANA SATU', now(), 'deni'),
('S2', 'SARJANA DUA', now(), 'admin'),
('S3', 'SARJANA 3 ', now(), 'admin');