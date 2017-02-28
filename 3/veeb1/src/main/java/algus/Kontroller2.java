package algus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Kontroller2 {
	   @RequestMapping("/geomeetrilise_keskmise_arvutus")
	   public String tervitus2(String a1, String a2){
		   try{
			   double arv1=Double.parseDouble(a1);
			   double arv2=Double.parseDouble(a2);
			   return String.valueOf(Math.sqrt(arv1*arv2));
		   } catch(Exception ex){
			   return ex.getMessage();
		   }
	   }
}
