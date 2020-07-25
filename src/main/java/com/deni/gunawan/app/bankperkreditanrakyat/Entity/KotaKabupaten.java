package com.deni.gunawan.app.bankperkreditanrakyat.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "master_kotakabupaten")
@AllArgsConstructor
@NoArgsConstructor
public class KotaKabupaten {

    @Id
    @GenericGenerator(name = "uuid_kotakabupaten" , strategy = "uuid2")
    @GeneratedValue(generator = "uuid_kotakabupaten")

    @Column(name = "kode_kotakabupaten", nullable = false, unique = true)
    private String id;
    @Column(name = "nama_kotakabupaten", nullable = false, length = 50)
    private String nama;
    @Column(name = "created_date")
    private Timestamp createdDate;
    @Column(name = "created_by", nullable = false, length = 20)
    private String createdBy;

    @OneToOne
    @JoinColumn(name = "provinsi_id", nullable = false)
    private Provinsi provinsi;

}
