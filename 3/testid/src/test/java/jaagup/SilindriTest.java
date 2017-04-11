package jaagup;

import org.junit.*;
import static org.junit.Assert.*;
public class SilindriTest{
	  Silinder s1=new Silinder(2, 5);
	  @Test
	  public void pindala1(){
		  assertEquals(12.5, s1.pohjaPindala(), 1);
	  }
	  @Test
	  public void ruumala1(){
		  assertEquals(63, s1.ruumala(), 2);
	  }	  
	  @Test
	  public void ruumala2(){
		  assertEquals(0, new Silinder(2, 0).ruumala(), 0.01);
	  }
}