package com.deni.gunawan.app.bankperkreditanrakyat.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.sql.Timestamp;

@Entity
@Table(name = "master_agama")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agama {

    @Id
    @GenericGenerator(name = "agama_id", strategy = "uuid2")
    @GeneratedValue(generator = "agama_id")

    @Column(name = "kode_agama", nullable = false, unique = true, length = 50)
    private String id;
    @Column(name = "nama_agama", nullable = false,  length = 50)
    private String nama;
    @Column(name = "deskripsi_agama")
    private String deskripsi;
    @Column(name = "created_date")
    private Timestamp createdDate;
    @Column(name = "created_by", length = 50)
    private String createdBy;


}
