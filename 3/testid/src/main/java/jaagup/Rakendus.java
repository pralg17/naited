package jaagup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Rakendus{
	@RequestMapping("/tervita")
	public String tervitamine(String eesnimi){
		return "Tere, "+eesnimi;
	}
	public static void main(String[] arg){
		SpringApplication.run(Rakendus.class, arg);
	}
}

/*
scl enable rh-maven33 bash
mvn package
java -Dserver.port=4200 -jar target/app-1.jar
http://greeny.cs.tlu.ee:4200/tervita?eesnimi=Juku
*/
