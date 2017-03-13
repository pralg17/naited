package jaagup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/geomeetriline_keskmine")
	String gk(String arv1, String arv2, String ymardus){
		if(arv1==null){return "andmed puuduvad";}
		int a1=Integer.parseInt(arv1);
		int a2=Integer.parseInt(arv2);
		double tulemus=Math.sqrt(a1*a2);
		if(ymardus!=null){tulemus=Math.round(tulemus);}
		return arv1+" ja " +arv2 + " geomeetriline keskmine on "+tulemus;
	}
	
	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi!";
    }
	
	@RequestMapping("/tervita")
	String tervitusfunktsioon3(String eesnimi){
		return "Tere, "+eesnimi;
	}
	
    //Lisage teine tervitusfunktsioon
	@RequestMapping("/algus2")
    String tervitusfunktsioon2() {
        return "Tere taas!";
    }
	
    public static void main(String[] args) {
		System.getProperties().put("server.port", 4200);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar