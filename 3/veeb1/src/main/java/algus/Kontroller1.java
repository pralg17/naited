package algus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class Kontroller1 {
	   @RequestMapping("/tutvustusleht")
	   public String tutvustus(){
		   return "Esimene leht";
	   }
	   @RequestMapping("/tutvustusleht2")
	   public String tutvustus2(){
		   return "Teine tutvustus!";
	   }
	   @RequestMapping("/tervitusleht1")
	   public String tervitus1(String eesnimi){
		   return "Tere, "+eesnimi+"!";
	   }
	   @RequestMapping("/tervitusleht2")
	   public String tervitus2(String eesnimi, String perekonnanimi){
		   return "Tere, "+perekonnanimi+", "+eesnimi+"!";
	   }
}
