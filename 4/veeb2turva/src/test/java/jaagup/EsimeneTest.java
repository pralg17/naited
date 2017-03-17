package jaagup;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	@Test
	public void test1(){
		assertEquals(3, 3);
	}
	@Test
	public void test2(){
		Rakendus r=new Rakendus();
		assertEquals("Ahoi!", r.tervitusfunktsioon());
	}
	@Test
	public void test3(){
		Rakendus r=new Rakendus();
		assertEquals("Tere, Juku", r.tervitusfunktsioon3("Juku"));
		assertEquals("Nime pikkus on 0", r.tervitusfunktsioon3(""));
		assertEquals("Nimi puudub", r.tervitusfunktsioon3(null));
	}

	@Test 
	public void keskmiseTest1(){
		Rakendus r=new Rakendus();
        assertEquals("5", r.keskmine("5"));		
        assertEquals("6", r.keskmine("6"));		
        assertEquals("Sisend puudub", r.keskmine(null));		
        assertEquals("Sisendi pikkus 0", r.keskmine(""));	
        assertEquals("6", r.keskmine("5,7"));		    		
        assertEquals("7", r.keskmine("5,9"));		    		
        assertEquals("sisendiks pole arv", r.keskmine("tere,5"));		    		
	}
}