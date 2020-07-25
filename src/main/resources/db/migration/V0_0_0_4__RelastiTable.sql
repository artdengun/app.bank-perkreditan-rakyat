create table master_provinsi(
kode_provinsi CHARACTER VARYING(255) not null unique primary key,
nama_provinsi CHARACTER VARYING(50) not null,
created_date TIMESTAMP,
created_by CHARACTER VARYING(20)
);

create table master_kotakabupaten(
kode_kotakabupaten CHARACTER VARYING(255) not null unique primary key,
nama_kotakabupaten CHARACTER VARYING(50) not null,
created_date TIMESTAMP,
created_by CHARACTER VARYING(20),
provinsi_id CHARACTER VARYING(255) NOT NULL REFERENCES master_provinsi(kode_provinsi)
);