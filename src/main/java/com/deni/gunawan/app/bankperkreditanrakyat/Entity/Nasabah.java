package com.deni.gunawan.app.bankperkreditanrakyat.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name = "data_nasabah", schema = "nasabah")
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipe_nasabah", discriminatorType = DiscriminatorType.STRING , length = 50)
public class Nasabah {

    @Id
    @GenericGenerator(name = "uuid_nasabah", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_nasabah")
    @Column(name = "nasabah_id", nullable = false, unique = true , length = 64)
    private String id;
    @Column(name = "nama_lengkap", nullable = false, length = 50)
    private String namaLengkap;
    @Column(name = "alamat_rumah")
    private String alamat;
}
