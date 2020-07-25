package com.deni.gunawan.app.bankperkreditanrakyat.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class NasabahPerorangan extends Nasabah {

    @Column(name = "data_ktp", length = 64)
    private String nomorIdentitas;
    @Column(name = "data_jk", length = 1)
    private String jenisKelamin;
}
