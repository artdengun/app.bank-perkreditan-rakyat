package com.deni.gunawan.app.bankperkreditanrakyat.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;



@Entity
@Data
@Table(name = "master_provinsi")
@AllArgsConstructor
@NoArgsConstructor
public class Provinsi {

    @Id
    @GenericGenerator(name = "uuid_provinsi" , strategy = "uuid2")
    @GeneratedValue(generator = "uuid_provinsi")

    @Column(name = "kode_provinsi", nullable = false, unique = true)
    private String id;
    @Column(name = "nama_provinsi", nullable = false, length = 50)
    private String nama;
    @Column(name = "created_date")
    private Timestamp createdDate;
    @Column(name = "created_by", nullable = false, length = 20)
    private String createdBy;

}
