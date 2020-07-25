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
public class NasabahBadanUsaha extends  Nasabah {
    @Column(name = "data_nomornpwp", length = 62)
    private String nomorNpwp;
}
