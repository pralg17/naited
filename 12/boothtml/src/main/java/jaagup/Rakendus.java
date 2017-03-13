package jaagup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Rakendus{	
	@RequestMapping("/geomeetriline_keskmine")
	String geomkesk(String arv1, String arv2){
	  try{
		double a1=Double.parseDouble(arv1);
		double a2=Double.parseDouble(arv2);
		return String.valueOf(Math.sqrt(a1*a2));
	  } catch(Exception e){
		 return "Viga: "+e.getMessage();
	  }
	}
 
	public static void main(String[] args){
		System.getProperties().put("server.port", 4200);
        SpringApplication.run(Rakendus.class, args);
	}
}