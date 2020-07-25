package com.deni.gunawan.app.bankperkreditanrakyat.Service;

import com.deni.gunawan.app.bankperkreditanrakyat.Entity.KotaKabupaten;
import com.deni.gunawan.app.bankperkreditanrakyat.Entity.Provinsi;
import com.deni.gunawan.app.bankperkreditanrakyat.Repository.KotaKabupatenRepository;
import com.deni.gunawan.app.bankperkreditanrakyat.Repository.ProvinsiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class WilayahService {

    @Autowired
    private ProvinsiRepository provinsiRepository;
    @Autowired
    private KotaKabupatenRepository kotaKabupatenRepository;

    public List<Provinsi> findAll(){
        return this.provinsiRepository.findAll();
    }

    public List<KotaKabupaten> findAllKota(){
        return this.kotaKabupatenRepository.findAll();
    }

    public Provinsi findProvinsiById(String id ) {
        return this.provinsiRepository.findProvinsiById(id);
    }
}
