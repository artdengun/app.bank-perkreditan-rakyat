package com.deni.gunawan.app.bankperkreditanrakyat.Repository;

import com.deni.gunawan.app.bankperkreditanrakyat.Entity.Agama;
import com.deni.gunawan.app.bankperkreditanrakyat.Entity.NasabahPerorangan;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgamaRepository extends CrudRepository<Agama, String> {
    public List<Agama> findAll();

    public Agama findByNama(String namaAgama);

    public List<Agama> findByNamaOrDeskripsi(String nama, String deskripsi);

    public Agama findPeroranganPerById(String id);


    @Modifying(clearAutomatically = true)
    @Query( value = "update Agama set nama = ?2,  deskripsi = ?3 where id = ?1")
    public int updateNamaAndDescription(String id, String nama, String deskripsi);

    @Modifying(clearAutomatically = true)
    @Query("delete from Agama where lower(nama) like %?1%")
    public int deleteByLikeName(String name);



   public Iterable<Agama> findAllById(String id);
}
