package com.deni.gunawan.app.bankperkreditanrakyat.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "master_pendidikan")
@AllArgsConstructor
@NoArgsConstructor
public class Pendidikan {

    @Id
    @GenericGenerator(name = "pendidikan_id" , strategy = "uuid2")
    @GeneratedValue(generator = "pendidikan_id")
    @Column(name = "kode_pendidikan", nullable = false, unique = true, length = 50)
    private String id;
    @Column(name = "nama_pendidikan", nullable = false, unique = true, length = 50)
    private String nama;
    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;
    @Column(name = "created_by", nullable = false, length = 50)
    private String createdBy;

}
