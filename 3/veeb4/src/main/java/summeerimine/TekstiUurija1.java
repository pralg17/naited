package summeerimine;
public class TekstiUurija1 implements ITekstiUurija{
	String sisu="";
	public void lisa(String tekst){
		sisu = sisu + " " + tekst;
	}
	public String kysi(){
		return sisu;
	}
	public int pikkus(){
		return sisu.length();
	}
}