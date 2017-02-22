import java.io.*;
import java.net.*;
public class Veeb2{
	public static void main(String[] args) throws IOException{
		BufferedReader lugeja = new BufferedReader(new InputStreamReader(
		  new URL("http://www.tlu.ee/~jaagup/andmed/ilm/harkutund.txt").
		     openConnection().getInputStream()
		));
		String rida=lugeja.readLine();
		System.out.println(rida);
		rida=lugeja.readLine();
		double vihmasumma=0;
		while(rida!=null){
			String[] m=rida.split(",");
			double sademed=Double.parseDouble(m[3]);
			if(m[0].equals("1")){ //Kui kuu on jaanuar
			  vihmasumma+=sademed;
			}
			rida=lugeja.readLine();
		}
		System.out.println(vihmasumma);
		//Leidke augusti maksimumtemperatuur
		lugeja.close();
	}
}