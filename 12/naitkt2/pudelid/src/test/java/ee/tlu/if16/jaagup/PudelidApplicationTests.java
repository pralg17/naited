package ee.tlu.if16.jaagup;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class PudelidApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void leheTest1(){
		assertEquals("Vaadis Kali, alles 300.0 liitrit.", 
		  this.restTemplate.getForObject("/kogusvaadis", String.class));
	}
	
	@Test
	public void pudeliTest1(){
		Jook j1=new Jook("Piim", 45, 0.95);
		assertEquals("Piim", j1.nimetus);
	}
	@Test 
	public void pudeliTest2(){
		Jook j1=new Jook("Piim", 45, 0.95);	    
        Joogipudel p1=new Joogipudel();
        p1.pudelimass=0.2;
        assertEquals(0.2, p1.koguMass(), 0.01);
		p1.j=j1;
		p1.maht=0.5;
		assertEquals(0.675, p1.koguMass(), 0.01);
	}
	@Test
	public void vaadiTest1(){
		Joogivaat v=new Joogivaat();
		v.j=new Jook("Kali", 30, 1.01);
		v.vaadimaht=500;
		Joogipudel p1=new Joogipudel();
        p1.pudelimass=0.2;
		p1.maht=0.5;
		assertNull(v.villi(p1)); //Tühjast vaadist ei saa villida
		v.taidetudmaht=300;
		Joogipudel villitudPudel=v.villi(p1);
		assertSame(villitudPudel, p1); //pärast villimist sama pudel
		assertEquals(p1.j.nimetus, v.j.nimetus); //Sama nimega jook pudelis
		assertEquals(299.5, v.taidetudmaht, 0.01);
		assertEquals(0.705, p1.koguMass(), 0.01);
	}
}
