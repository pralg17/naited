package ee.tlu.if16.jaagup;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PudelidApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void pudeliTest1(){
		Jook j1=new Jook("Piim", 45, 0.95);
		assertEquals("Piim", j1.nimetus);
	}

}
