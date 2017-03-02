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
    private LugejaDao lugejaDao;
	
	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi!";
    }
    @RequestMapping("/leia")
	String leia(String email){
	   Lugeja isik=lugejaDao.findByEmail(email);
	   return email+" laenutusi "+isik.laenutusi;
	}
	
    @RequestMapping("/lisa")
	String lisa(String email){
	   Lugeja isik=new Lugeja();
	   isik.email=email;
	   isik.laenutusi=1;
	   lugejaDao.save(isik);
	   return "Lisatud "+email;
	}
	
    public static void main(String[] args) {
		System.getProperties().put("server.port", 4201);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot-1.jar