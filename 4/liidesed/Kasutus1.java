import java.io.*;
public class Kasutus1{
	public static void salvestaVeebileht(VeebisKuvatav obj, String failinimi){
		String s="<!doctype html><html><body>"+obj.html()+"</body></html>";
		try{
			PrintWriter pw=new PrintWriter(new FileWriter(failinimi));
			pw.println(s);
			pw.close();
		} catch(Exception e){e.printStackTrace();}
	}
	public static void tryki(VeebisKuvatav obj){
		System.out.println(obj.html());
	}
	public static void main(String[] arg){
		System.out.println(new VeebiTekst("3>2").html());
		PealkirjagaTekst pt1=new PealkirjagaTekst("Jalgpallilahing", "3 > 0");
		tryki(pt1);
		ReasPaigutus rp1=new ReasPaigutus();
		rp1.lisaElement(pt1);
		rp1.lisaElement(new PealkirjagaTekst("Ilmateade", "Viimast korda suusad all"));
		tryki(rp1);
		salvestaVeebileht(rp1, "leht1.html");
	}
}