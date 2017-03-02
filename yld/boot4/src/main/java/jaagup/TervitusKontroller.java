package jaagup;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestParam; 

@Controller
public class TervitusKontroller {
	@RequestMapping("/tervitus1")
	public String tervitus1(Model model){
	   model.addAttribute("eesnimi", "Juku");
	   return "tervitus";
	}
 
	@RequestMapping("/tervitus2")
	public String tervitus2(Model model,  
	   @RequestParam(value="eesnimi", required=false, defaultValue="Mati") String enimi){
	   model.addAttribute("eesnimi", enimi);
	   return "tervitus";
	}
}
