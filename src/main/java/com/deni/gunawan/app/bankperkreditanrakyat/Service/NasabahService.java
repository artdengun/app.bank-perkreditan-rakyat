package com.deni.gunawan.app.bankperkreditanrakyat.Service;


import com.deni.gunawan.app.bankperkreditanrakyat.Entity.Nasabah;
import com.deni.gunawan.app.bankperkreditanrakyat.Entity.NasabahBadanUsaha;
import com.deni.gunawan.app.bankperkreditanrakyat.Entity.NasabahPerorangan;
import com.deni.gunawan.app.bankperkreditanrakyat.Repository.NasabahBadanUsahaRepository;
import com.deni.gunawan.app.bankperkreditanrakyat.Repository.NasabahPeroranganRepository;
import com.deni.gunawan.app.bankperkreditanrakyat.Repository.NasabahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class NasabahService {
    @Autowired
    private NasabahRepository nasabahRepository;
    @Autowired
    private NasabahPeroranganRepository nasabahPeroranganRepository;
    @Autowired
    private NasabahBadanUsahaRepository nasabahBadanUsahaRepository;

    @Transactional
    public Nasabah save(Nasabah nasabah){
        return this.nasabahRepository.save(nasabah);
    }
    @Transactional
    public NasabahPerorangan save(NasabahPerorangan nasabahPerorangan){
        return this.nasabahRepository.save(nasabahPerorangan);
    }
    @Transactional
    public NasabahBadanUsaha save(NasabahBadanUsaha nasabahBadanUsaha){
        return this.nasabahRepository.save(nasabahBadanUsaha);
    }
    @Transactional
    public void delete(Nasabah nasabah){
        this.nasabahRepository.delete(nasabah);
    }

    @Transactional
    public void delete(NasabahBadanUsaha nasabahBadanUsaha){
        this.nasabahRepository.delete(nasabahBadanUsaha);
    }

    @Transactional
    public  NasabahPerorangan findByPeroranganId(String id){
        return this.nasabahPeroranganRepository.findPeroranganPerById(id);
    }


    @Transactional
    public  NasabahBadanUsaha findPeroranganPerById(String id){
        return this.nasabahBadanUsahaRepository.findNasabahbadanusahaById(id);
    }

}
