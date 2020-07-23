package com.deni.gunawan.app.bankperkreditanrakyat;

import com.deni.gunawan.app.bankperkreditanrakyat.Entity.Agama;
import com.deni.gunawan.app.bankperkreditanrakyat.Entity.Pendidikan;
import com.deni.gunawan.app.bankperkreditanrakyat.Repository.AgamaRepository;
import com.deni.gunawan.app.bankperkreditanrakyat.Repository.PendidikanRepository;
import com.deni.gunawan.app.bankperkreditanrakyat.Service.AgamaService;
import com.deni.gunawan.app.bankperkreditanrakyat.Service.PendidikanService;
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

		Pendidikan paketA = new Pendidikan("PAKET A","SD",Timestamp.valueOf(LocalDateTime.now()), "deni");
		pendidikanRepository.save(paketA);
		Pendidikan paketB = new Pendidikan("PAKET B","SMP",Timestamp.valueOf(LocalDateTime.now()), "admin");
		pendidikanRepository.save(paketB);
		Pendidikan paketC = new Pendidikan("PAKET C","SMA",Timestamp.valueOf(LocalDateTime.now()), "admin");
		pendidikanRepository.save(paketC);
		Pendidikan paketD = new Pendidikan("PAKET D","Strata satu",Timestamp.valueOf(LocalDateTime.now()), "admin");
		pendidikanRepository.save(paketD);
		List<Pendidikan> daftarPendidikan = pendidikanRepository.findAll();
		assertEquals(daftarPendidikan.size(), 11);
	}

	@Test
	public void testAgama(){

			Agama islam = new Agama("Hindu","Budha","Agama Orang hindu", Timestamp.valueOf(LocalDateTime.now()), "Deni Gunawan");
			agamaRepository.save(islam);

			Agama kepercayaan = new Agama("kepercayaan","agama kepercayaan", "agamanya kepercayaan",Timestamp.valueOf(LocalDateTime.now()), "deni");

			List<Agama> daftarAgama= agamaRepository.findAll();
			assertEquals(daftarAgama.size(), 6);
	}



}
