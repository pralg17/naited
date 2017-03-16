package jaagup;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	@Test
	public void katse1(){
		assertEquals(3, 2+1);
	}

    @Test
    public void tervituseTest(){
		Rakendus r=new Rakendus();
		assertEquals("Tere, Juku", r.tervitusfunktsioon3("Juku"));
	}	
	@Test
	public void tervituseTest2(){
		Rakendus r=new Rakendus();
		assertEquals("Tere, kodanik Juurikas J", r.tervitusfunktsioon4("Juku", "Juurikas"));
	}
}