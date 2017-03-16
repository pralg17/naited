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
		if(eesnimi==null){return "eesnimi puudub";}
		return "Tere,"+eesnimi;
	}
	
	//Looge juurde funktsioon, mis saab parameetriteks ees- ja perekonnanime ning
	//tervitab kasutajat kujul "Tere, kodanik Kippar J".
	//Koostage juurde test paari erisuguse nimega kontrollimaks, et käsklus töötab õigesti
	

    public static void main(String[] args) {
		System.getProperties().put("server.port", 4200);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar
