package com.deni.gunawan.app.bankperkreditanrakyat.Service;

import com.deni.gunawan.app.bankperkreditanrakyat.Entity.Agama;
import com.deni.gunawan.app.bankperkreditanrakyat.Repository.AgamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class AgamaService {

    @Autowired
    private AgamaRepository agamaRepository;
        // function yang harus ada return
        @Transactional(readOnly = false)
        public Agama save(Agama x) {
        return agamaRepository.save(x);
    }
    // function yang harus ada return
    public Optional<Agama> findById(String id){
        return agamaRepository.findById(id);
    }
            // function ang harus ada return
            // kita buat perintah untuk mencari list
    public List<Agama> findAll(){
        return agamaRepository.findAll();
    }

        // prosedur , didalam prosedur dapat memiliki banyak perintah
        @Transactional(readOnly = false)
        public void delete(Agama x ) {
        this.agamaRepository.delete(x);
    }
        // prosedur delete by id
        @Transactional(readOnly = false)
        public void deletById(String x ) {
            this.agamaRepository.deleteById(x);
    }

            // proseur delete all
            @Transactional(readOnly = false)
            public void deletSemuanya(List<Agama> x) {
            this.agamaRepository.deleteAll(x);
    }
}
