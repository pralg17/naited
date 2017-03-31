package kuvamine;
public class PealkirjagaTekst implements VeebisKuvatav{
	VeebiTekst pealkiri;
	VeebiTekst sisu;
	public PealkirjagaTekst(String p, String s){
		pealkiri=new VeebiTekst(p);
		sisu=new VeebiTekst(s);
	}
	public String html(){
		return "<h2>"+pealkiri.html()+"</h2>\n"+sisu.html();
	}
}