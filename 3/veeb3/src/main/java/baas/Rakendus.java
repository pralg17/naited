package baas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@RestController
public class Rakendus {
	@Autowired
	private KasutajateHaldur haldur;

	@RequestMapping("/loetelu7")
	public String loetelu7(float miinimum){
		Iterable<Kasutaja> kasutajad=haldur.findBySaldoGreaterThan(miinimum);
		StringBuffer sb=new StringBuffer();
		for(Kasutaja k: kasutajad){
			sb.append(k.kasutajanimi+"-"+k.saldo);
			for(Arve a: k.arved){
			  sb.append(" ("+a.summa+")");
			}
			sb.append("<br />");
		}
		return sb.toString();
	}
	

	
	//kuvage etteantust suurema saldoga kontod
	
	@RequestMapping("/loetelu6")
	public String loetelu6(float miinimum){
		Iterable<Kasutaja> kasutajad=haldur.findBySaldoGreaterThan(miinimum);
		StringBuffer sb=new StringBuffer();
		for(Kasutaja k: kasutajad){
			sb.append(k.kasutajanimi+"-"+k.saldo+"<br />");
		}
		return sb.toString();
	}
	
	
	@RequestMapping("/loetelu5")
	public String loetelu5(){
		Iterable<Kasutaja> kasutajad=haldur.findBySaldoLessThan(40.0f);
		StringBuffer sb=new StringBuffer();
		for(Kasutaja k: kasutajad){
			sb.append(k.kasutajanimi+"-"+k.saldo+"<br />");
		}
		return sb.toString();
	}
	

	
	@RequestMapping("/loetelu4")
	public String loetelu4(){
		Iterable<Kasutaja> kasutajad=haldur.findByKasutajanimiLike("j%");
		StringBuffer sb=new StringBuffer();
		for(Kasutaja k: kasutajad){
			sb.append(k.kasutajanimi+"-"+k.saldo+"<br />");
		}
		return sb.toString();
	}
	


	@RequestMapping("/loetelu3")
	public String loetelu3(){
		Iterable<Kasutaja> kasutajad=haldur.findTop2ByOrderBySaldoDesc();
		StringBuffer sb=new StringBuffer();
		for(Kasutaja k: kasutajad){
			sb.append(k.kasutajanimi+"-"+k.saldo+"<br />");
		}
		return sb.toString();
	}
	

	
	@RequestMapping("/loetelu2")
	public String loetelu2(){
		Iterable<Kasutaja> kasutajad=haldur.findAllByOrderBySaldo();
		StringBuffer sb=new StringBuffer();
		for(Kasutaja k: kasutajad){
			sb.append(k.kasutajanimi+"-"+k.saldo+"<br />");
		}
		return sb.toString();
	}
	
	@RequestMapping("/loetelu1")
	public String loetelu1(){
		Iterable<Kasutaja> kasutajad=haldur.findAll();
		StringBuffer sb=new StringBuffer();
		for(Kasutaja k: kasutajad){
			sb.append(k.kasutajanimi+"-"+k.saldo+"<br />");
		}
		return sb.toString();
	}
	
	@RequestMapping("/lisamine")
	public String lisamine1(String knimi, float kogus){
		if(knimi==null){return "Kasutaja määramata";}
		Kasutaja k=haldur.findOne(knimi);
		if(k==null){
			return knimi+" puudub";
		}
        k.saldo=k.saldo+kogus;
        haldur.save(k);	
        return uuring1(knimi);		
	}
	
	//Kuvage kasutajate arv
	
	@RequestMapping("/rahauuring")
	public String uuring1(String knimi){
		if(knimi==null){return "Kasutaja määramata";}
		Kasutaja k=haldur.findOne(knimi);
		if(k==null){
			return knimi+" puudub";
		}
		return knimi+" kontol "+k.saldo;
	}
	
	@RequestMapping("/tervitusleht1")
	public String tervitus1(String eesnimi){
		   return "Tere, "+eesnimi+"!";
	}	
	public static void main(String[] args) {
		System.getProperties().put("server.port", 4200);
		System.getProperties().put("spring.datasource.url", 
		   "jdbc:mysql://localhost/if16_jaagup_3");
		System.getProperties().put("spring.datasource.maxActive", "2");
		System.getProperties().put("spring.datasource.username", "if16");
		System.getProperties().put("spring.datasource.password", "ifikad16");
		SpringApplication.run(Rakendus.class);
	}
}