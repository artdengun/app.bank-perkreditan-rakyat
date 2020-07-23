create table master_agama(
kode_agama CHARACTER VARYING(50) not null unique primary key,
nama_agama CHARACTER VARYING(50) not null,
deskripsi_agama CHARACTER VARYING(100) not null,
created_date TIMESTAMP not null,
created_by CHARACTER VARYING(50) not null
);

INSERT INTO master_agama(kode_agama, nama_agama, deskripsi_agama, created_date, created_by)
VALUES
('Muslim','ISLAM','semua berawal dari  islam', Now(), 'Admin Kepala'),
('Kristen','protestan','semua berawal dari  islam', Now(), 'Admin Kepala');
