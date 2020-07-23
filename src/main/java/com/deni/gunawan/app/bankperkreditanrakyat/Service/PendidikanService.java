package com.deni.gunawan.app.bankperkreditanrakyat.Service;

import com.deni.gunawan.app.bankperkreditanrakyat.Entity.Pendidikan;
import com.deni.gunawan.app.bankperkreditanrakyat.Repository.PendidikanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true )
public class PendidikanService {

    @Autowired
    private PendidikanRepository repo;
    // buat function untuk mensave
    @Transactional(readOnly = false)
    public Pendidikan save(Pendidikan s){
        return repo.save(s);
    }
    // find semuanya
    public List<Pendidikan> findAll(){
        return repo.findAll();
    }
    // find by id
    public Optional<Pendidikan> findById(String s){
        return repo.findById(s);
    }

    // delete
    @Transactional(readOnly = false)
    public void delete(Pendidikan x) {
        this.repo.delete(x);
    }

    // delete by id
    @Transactional(readOnly = false)
    public void deleteById(String x ) {
        this.repo.deleteById(x);
    }

    // delete semuanya
    @Transactional(readOnly = false)
    public  void deleteAll(){
        this.repo.deleteAll();
    }
}
