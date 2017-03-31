package kuvamine;
public class VeebiTekst implements VeebisKuvatav{
	String sisu;
	public VeebiTekst(String uusSisu){
		sisu=uusSisu;
	}
	public String html(){
		return sisu.replace("<", "&lt;").replace(">", "&gt;");
	}
}