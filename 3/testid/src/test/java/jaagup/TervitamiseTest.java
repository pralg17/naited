package jaagup;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class TervitamiseTest{
	@Autowired
	private TestRestTemplate restTemplate;
	@Test
	public void tervitus1(){
		assertEquals("Tere, Mati", this.restTemplate.
		  getForObject("/tervita?eesnimi=Mati", String.class));
	}
	@Test 
	public void ruumala1(){
		String vastus=this.restTemplate.getForObject(
		  "/silindriruumala?raadius=1&korgus=2", String.class);
		assertEquals("Silindri ruumala on ", vastus.substring(0, 20));
		assertEquals(6.28, Double.parseDouble(vastus.substring(20)), 0.1);
	}
}
