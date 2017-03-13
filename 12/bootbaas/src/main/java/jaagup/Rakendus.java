package jaagup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@SpringBootApplication
public class Rakendus {
	
	@Autowired
	private LugejateHaldur haldur;
	
	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi!";
    }
	
	@RequestMapping("/leia")
	String leidmine(String email){
		if(email==null){return "aadress sisestamata";}
		Lugeja isik=haldur.findOne(email);
		if(isik==null){return email+" puudub baasist";}
		return email+" laenutusi: "+isik.laenutusi;
	}
 
    public static void main(String[] args) {
		System.getProperties().put("server.port", 41200);
        SpringApplication.run(Rakendus.class, args);
    }
}
