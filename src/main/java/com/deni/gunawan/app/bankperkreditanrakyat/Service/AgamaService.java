package com.deni.gunawan.app.bankperkreditanrakyat.Service;

import com.deni.gunawan.app.bankperkreditanrakyat.Entity.Agama;
import com.deni.gunawan.app.bankperkreditanrakyat.Repository.AgamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class AgamaService {

    @Autowired
    private AgamaRepository agamaRepository;

    @Transactional(readOnly = false)
    public Agama save(Agama x) {
        return agamaRepository.save(x);
    }

    public List<Agama> findAll() {
        return agamaRepository.findAll();
    }

    @Transactional
    public void deleteAgamaId(String id) {
        this.agamaRepository.deleteById(id);
    }

    @Transactional(readOnly = false)
    public void deletById(String x) {

        this.agamaRepository.deleteById(x);
    }

    @Transactional
    public void deleteAll(List<Agama> list) {
        this.agamaRepository.deleteAll(list);
    }

    @Transactional
    public Agama findByNama(String nama) {
        return this.agamaRepository.findByNama(nama);
    }

    @Transactional
    public List<Agama> findByNamaOrDeskripsi(String nama, String deskripsi) {
        return this.agamaRepository.findByNamaOrDeskripsi(nama, deskripsi);
    }

    @Transactional
    public void updateById(String nama, String deskripsi, String id) {
        this.agamaRepository.updateNamaAndDescription(id, nama, deskripsi);
    }

    @Transactional
    public void deleteByName(String name) {
        this.agamaRepository.findByNama(name);
    }

    @Transactional
    public Agama findPeroranganPerById(String id) {
        return this.agamaRepository.findPeroranganPerById(id);
    }

}