package jaagup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import summeerimine.*;

@RestController
@SpringBootApplication
public class Rakendus1 {
	@RequestMapping("/summa1")
	public String leiaSumma(int arv1, int arv2){
		Summeerija ladu=new HarilikSummeerija();
		ladu.lisa(arv1);
		ladu.lisa(arv2);
		return "Kokku: "+ladu.kysi();
	}
	public static void main(String[] args) {
		System.getProperties().put("server.port", 4200);
		SpringApplication.run(Rakendus1.class);
	}
}