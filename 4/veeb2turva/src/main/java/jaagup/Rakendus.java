package jaagup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {

	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi!";
    }
	
	@RequestMapping("/tervita")
	String tervitusfunktsioon3(String eesnimi){
		if(eesnimi==null){
		   return "Nimi puudub";
		}
		if(eesnimi.length()==0){
		   return "Nime pikkus on 0";
		}
		return "Tere, "+eesnimi;
	}
	//Aritmeetiline keskmine komadega eraldatud täisarvudest stringis
	//koosta funktsioon "keskmine", mis tagastaks parameetrina antud stringi
	@RequestMapping("/keskmine")
	public String keskmine(String sisend){
		if(sisend==null){
			return "Sisend puudub";
		}
		if(sisend.equals("")){
			return "Sisendi pikkus 0";
		}
		String[] m=sisend.split(",");
		if(m.length==2){
		  try{
			int a1=Integer.parseInt(m[0]);
			int a2=Integer.parseInt(m[1]);
			return String.valueOf((a1+a2)/2);
		  } catch(Exception ex){
			  return "sisendiks pole arv";
		  }
		}
		return sisend;
	}

    public static void main(String[] args) {
		System.getProperties().put("server.port", 4200);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar