package com.deni.gunawan.app.bankperkreditanrakyat;

import com.deni.gunawan.app.bankperkreditanrakyat.Entity.Agama;
import com.deni.gunawan.app.bankperkreditanrakyat.Entity.Pendidikan;
import com.deni.gunawan.app.bankperkreditanrakyat.Repository.AgamaRepository;
import com.deni.gunawan.app.bankperkreditanrakyat.Repository.PendidikanRepository;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests extends TestCase {

		@Autowired
		private PendidikanRepository pendidikanRepository;

		@Autowired
		private AgamaRepository agamaRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public  void TestPendidikan(){

		Pendidikan paketA = new Pendidikan("PAKET A","Sekolah Dasar","Karna Semangat Belajar",Timestamp.valueOf(LocalDateTime.now()), "deni");
		pendidikanRepository.save(paketA);
		Pendidikan paketB = new Pendidikan("PAKET B","SMP","Karna Semangat Belajar",Timestamp.valueOf(LocalDateTime.now()), "admin");
		pendidikanRepository.save(paketB);
		Pendidikan paketC = new Pendidikan("PAKET C","SMA","Karna Semangat Belajar",Timestamp.valueOf(LocalDateTime.now()), "admin");
		pendidikanRepository.save(paketC);
		Pendidikan paketD = new Pendidikan("PAKET D","Strata satu","Karna Semangat Belajar",Timestamp.valueOf(LocalDateTime.now()), "admin");
		pendidikanRepository.save(paketD);
		List<Pendidikan> daftarPendidikan = pendidikanRepository.findAll();
		assertEquals(daftarPendidikan.size(), 11);
	}

	@Test
	public void testAgama(){

			Agama islam = new Agama("Hindu","Budha","Agama Orang hindu", Timestamp.valueOf(LocalDateTime.now()), "Deni Gunawan");
			agamaRepository.save(islam);
//
			Agama kepercayaan = new Agama("kepercayaan","agamanya kepercayaan", "agamanya kepercayaan",Timestamp.valueOf(LocalDateTime.now()), "deni");
			agamaRepository.save(kepercayaan);

			List<Agama> daftarAgama= agamaRepository.findAll();
		assertEquals(daftarAgama.size(), 6);

		// method mencari nama by nama
		islam = agamaRepository.findByNama("ISLAM");
		assertNotNull(islam);

		List<Agama> findNamaByDesk = agamaRepository.findByNamaOrDeskripsi("protestan ","semua berawal dari  islam ");
		assertNotNull(findNamaByDesk);
//
//		Agama islam2 = new Agama();
//
//		islam2.setId(islam.getId());
//		islam2.setNama("ISIS");
//		agamaRepository.save(islam2);
//		islam2 = agamaRepository.findByNama("ISIS");
//
//		assertNull(islam2);
		// method mencari by nama dan deksripsi
////		Method delete
//		agamaRepository.deleteAll(daftarAgama);
//		daftarAgama = agamaRepository.findAll();
//		assertEquals(daftarAgama.size(), 0);
			}



}
