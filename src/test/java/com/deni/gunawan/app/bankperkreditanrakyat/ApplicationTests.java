package com.deni.gunawan.app.bankperkreditanrakyat;

import com.deni.gunawan.app.bankperkreditanrakyat.Entity.*;
import com.deni.gunawan.app.bankperkreditanrakyat.Service.*;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests extends TestCase {

    @Autowired
    private PendidikanService pendidikanService;

    @Autowired
    private AgamaService agamaService;

    @Autowired
    private WilayahService wilayahService;

    @Autowired
    private UserService userService;

    @Autowired
    private NasabahService nasabahService;

    @Test
    void contextLoads() {
    }

    @Test
    public void TestPendidikan() {

        Pendidikan paketA = new Pendidikan("PAKET A", "Sekolah Dasar", "Karna Semangat Belajar", Timestamp.valueOf(LocalDateTime.now()), "deni");
//        pendidikanService.save(paketA);
        Pendidikan paketB = new Pendidikan("PAKET B", "SMP", "Karna Semangat Belajar", Timestamp.valueOf(LocalDateTime.now()), "admin");
//        pendidikanService.save(paketB);
        Pendidikan paketC = new Pendidikan("PAKET C", "SMA", "Karna Semangat Belajar", Timestamp.valueOf(LocalDateTime.now()), "admin");
//        pendidikanService.save(paketC);
        Pendidikan paketD = new Pendidikan("PAKET D", "Strata satu", "Karna Semangat Belajar", Timestamp.valueOf(LocalDateTime.now()), "admin");
//        pendidikanService.save(paketD);
        List<Pendidikan> daftarPendidikan = pendidikanService.findAll();
        assertEquals(daftarPendidikan.size(), 7);
    }

    @Test
    public void testAgama() {

        Agama islam = new Agama("Muslim", "protestan", "Agama Orang islam", Timestamp.valueOf(LocalDateTime.now()), "Deni Gunawan");
//        agamaService.save(islam);

        Agama kepercayaan = new Agama("kepercayaan", "agamanya kepercayaan", "agamanya kepercayaan", Timestamp.valueOf(LocalDateTime.now()), "deni");
//        agamaService.save(kepercayaan);

        List<Agama> daftarAgama = agamaService.findAll();
        assertEquals(daftarAgama.size(), 5);

        // method mencari nama by nama
        islam = agamaService.findByNama("protestan");
        assertNotNull(islam);


        List<Agama> findNamaByDesk = agamaService.findByNamaOrDeskripsi("protestan ", "semua berawal dari  islam ");
        assertNotNull(findNamaByDesk);

        // update nama
        Agama islam2 = new Agama();
        islam2.setId(islam.getId());
        islam2.setNama(islam.getNama());
        islam2.setDeskripsi(islam.getDeskripsi());
        islam2.setId("ISIS");
        islam2.setCreatedDate(Timestamp.valueOf(LocalDateTime.now()));
        islam2.setNama("islam");
        islam2.setDeskripsi("Tentang agama");

        agamaService.save(islam2);


        agamaService.updateById(kepercayaan.getId(), "robi", " data berubah");
        assertEquals(kepercayaan.getDeskripsi(), "data berubah");
        assertEquals(kepercayaan.getNama(), "robi");

        agamaService.deleteByName("%i%");

        agamaService.deleteAll(daftarAgama);
		daftarAgama = agamaService.findAll();
		assertEquals(daftarAgama.size(), 0);

    }


    @Test
    public void testKOtaKab(){
        List<Provinsi> daftarwilayah = wilayahService.findAll();
        assertEquals(daftarwilayah.size(), 2 );

        Provinsi jawaBarat = this.wilayahService.findProvinsiById("001");
        assertNotNull(jawaBarat);
        assertEquals(1, jawaBarat.getListKota().size());


        List<KotaKabupaten> daftarkota = wilayahService.findAllKota();
        assertEquals(daftarkota.size(), 2);

        daftarwilayah.forEach((k) -> {
            System.out.println(k.toString());
        });
    }

    @Test
    public void testUserSecurity(){
        List<RoleSecurity> listRole = this.userService.listRole();
        assertEquals(2,listRole.size() );

        List<UserSecurity> users = this.userService.findUser();
        assertEquals(2,users.size());

        UserSecurity admin = this.userService.findByNama("admin");
        assertNotNull(admin);
        assertEquals(2, admin.getListRole().size());

        UserSecurity dimas = this.userService.findByNama("dimas");
        assertNotNull(dimas);
        assertEquals(1, dimas.getListRole().size());

    }

    @Test
    public  void testSimpanNasabah(){
        NasabahPerorangan  dimas = new NasabahPerorangan();
        dimas.setJenisKelamin("L");
        dimas.setNamaLengkap("Deni Gunawan");
        dimas.setNomorIdentitas("625484664646");
        dimas.setAlamat("Jl. Child Casavva ");
        dimas =  this.nasabahService.save(dimas);

        dimas = this.nasabahService.findByPeroranganId(dimas.getId());
        assertNotNull(dimas);
        Nasabah badan = this.nasabahService.findPeroranganPerById(dimas.getId());
        assertNull(badan);
    //    this.nasabahService.delete(dimas);

        NasabahBadanUsaha ptdeni = new NasabahBadanUsaha();
        ptdeni.setNamaLengkap("PT yang penting ngopi");
        ptdeni.setNomorNpwp("65652626");
        ptdeni.setAlamat("JL. WKWKW AYEE");
        ptdeni = this.nasabahService.save(ptdeni);
        assertNotNull(ptdeni.getId());
//        this.nasabahService.delete(ptdeni);

    }

}
