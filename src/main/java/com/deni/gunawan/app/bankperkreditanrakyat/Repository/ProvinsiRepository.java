package com.deni.gunawan.app.bankperkreditanrakyat.Repository;

import com.deni.gunawan.app.bankperkreditanrakyat.Entity.Provinsi;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProvinsiRepository  extends CrudRepository<Provinsi, String> {
    public List<Provinsi> findAll();
}
