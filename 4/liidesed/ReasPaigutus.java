import java.util.*;
public class ReasPaigutus implements VeebisKuvatav{
	List<VeebisKuvatav> elemendid=new ArrayList<VeebisKuvatav>();
	public void lisaElement(VeebisKuvatav e){
		elemendid.add(e);
	}
	public String html(){
		StringBuffer sb=new StringBuffer();
		sb.append("<div style='display: flex'>");
		for(VeebisKuvatav e: elemendid){
			sb.append("<container style='padding: 20px'>"+e.html()+"</container>");
		}
		sb.append("</div>");
		return sb.toString();
	}
}

//Pane kasutuse juures kõrvuti VeebiTekst ja PealkirjagaTekst