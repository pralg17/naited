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
	   Lugeja isik=lugejaDao.findOne(email);
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
	
    @RequestMapping("/suurenda")
	String suurenda(String email){
	   Lugeja isik=lugejaDao.findOne(email);
	   isik.laenutusi++;
	   lugejaDao.save(isik);
	   return email+": "+isik.laenutusi;
	}
	
	@RequestMapping("/loetelu")
	public Iterable<Lugeja> loetelu(){
	  return lugejaDao.findAll();
	}
	
	@RequestMapping("/loetelu2")
	public String loetelu2(){
	  StringBuffer sb=new StringBuffer();
	  for(Lugeja isik: lugejaDao.findAll()){
	     sb.append(isik);
	  }
	  return sb.toString();
	}
	
	@RequestMapping("/kustuta")
	public String kustuta(String email){
	    Lugeja isik=lugejaDao.findOne(email);
		lugejaDao.delete(isik);
		return email+" kustutatud";
	}

	@RequestMapping("/kogus")	
	public long kogus(String email){
	   return lugejaDao.count();
	}
	
    public static void main(String[] args) {
		System.getProperties().put("server.port", 4201);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot-1.jar