import java.io.*;
import java.net.*;
public class VeebiFunktsioon implements Funktsioon{
	String veebiaadress;
	String parameetrinimi;
	public VeebiFunktsioon(String veebiaadress, String parameetrinimi){
		this.veebiaadress=veebiaadress;
		this.parameetrinimi=parameetrinimi;
	}
	public double f(double x){
		try{
			BufferedReader lugeja=new BufferedReader(new InputStreamReader(
			  new URL(veebiaadress+"?"+parameetrinimi+"="+x).openConnection().getInputStream()
			));
			String rida=lugeja.readLine();
			return Double.parseDouble(rida);
		} catch(Exception ex){System.out.println(ex.getMessage());}
		return -1;
	}
}