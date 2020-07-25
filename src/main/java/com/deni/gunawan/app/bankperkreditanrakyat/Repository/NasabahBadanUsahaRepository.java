package com.deni.gunawan.app.bankperkreditanrakyat.Repository;

import com.deni.gunawan.app.bankperkreditanrakyat.Entity.NasabahBadanUsaha;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NasabahBadanUsahaRepository extends CrudRepository<NasabahBadanUsaha, String> {
    public List<NasabahBadanUsaha> findAll();

    public  NasabahBadanUsaha findNasabahbadanusahaById(String id);

}
