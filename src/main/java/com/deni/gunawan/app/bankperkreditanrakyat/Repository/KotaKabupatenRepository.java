package com.deni.gunawan.app.bankperkreditanrakyat.Repository;

import com.deni.gunawan.app.bankperkreditanrakyat.Entity.KotaKabupaten;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface KotaKabupatenRepository  extends CrudRepository<KotaKabupaten, String> {
    public List<KotaKabupaten> findAll();
}
