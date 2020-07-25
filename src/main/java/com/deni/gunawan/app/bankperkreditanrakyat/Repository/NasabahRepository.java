package com.deni.gunawan.app.bankperkreditanrakyat.Repository;

import com.deni.gunawan.app.bankperkreditanrakyat.Entity.Nasabah;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NasabahRepository extends CrudRepository<Nasabah, String> {
    public List<Nasabah> findAll();

}
