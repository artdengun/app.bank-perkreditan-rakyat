create schema nasabah;

create table nasabah.data_nasabah(
tipe_nasabah CHARACTER VARYING(50),
nasabah_id CHARACTER VARYING(64) not null primary key,
nama_lengkap CHARACTER VARYING(50) not null,
alamat_rumah CHARACTER VARYING(255),
data_nomornpwp CHARACTER VARYING(62),
data_ktp    CHARACTER VARYING(64),
data_jk     CHARACTER VARYING(1)
);