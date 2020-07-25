package com.deni.gunawan.app.bankperkreditanrakyat.Repository;

import com.deni.gunawan.app.bankperkreditanrakyat.Entity.NasabahPerorangan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NasabahPeroranganRepository  extends CrudRepository<NasabahPerorangan, String> {
    public List<NasabahPerorangan> findAll();

    public  NasabahPerorangan findPeroranganPerById(String id);

}
