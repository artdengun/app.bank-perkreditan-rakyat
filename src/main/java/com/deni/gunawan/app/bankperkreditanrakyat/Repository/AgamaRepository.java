package com.deni.gunawan.app.bankperkreditanrakyat.Repository;

import com.deni.gunawan.app.bankperkreditanrakyat.Entity.Agama;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgamaRepository extends CrudRepository<Agama, String> {
    public List<Agama> findAll();
}
