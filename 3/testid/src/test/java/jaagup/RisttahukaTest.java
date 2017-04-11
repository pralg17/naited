package jaagup;

import org.junit.*;
import static org.junit.Assert.*;
public class RisttahukaTest{
	@Test
	public void pindala(){
		Risttahukas r1=new Risttahukas(3, 4, 5);
		assertEquals(12, r1.pohjaPindala(), 0.01);
	}
	//Kirjutage test risttahuka ruumala arvutamise kontrolliks
	@Test
	public void ruumala(){
		assertEquals(6, new Risttahukas(1, 2, 3).ruumala(), 0.01);
	}
	
}