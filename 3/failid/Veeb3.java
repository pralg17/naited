import java.io.*;
import java.net.*;
public class Veeb3{
	public static void main(String[] args) throws IOException{
		BufferedReader lugeja = new BufferedReader(new InputStreamReader(
		  new URL("http://www.tlu.ee/~jaagup/andmed/ilm/harkutund.txt").
		     openConnection().getInputStream()
		));
		String rida=lugeja.readLine();
		System.out.println(rida);
		rida=lugeja.readLine();
		double maxtemp=0;
		String kuu="10";
		boolean alustatud=false; //Kas on juba selle kuu kirjeid leitud
		int puuduvaid=0;
		while(rida!=null){
			String[] m=rida.split(",");
			if(m[0].equals(kuu)){ //Kui kuu on otsitav
			 try{
			  double temperatuur=Double.parseDouble(m[5]);
			  if(alustatud){
				  if(temperatuur>maxtemp){maxtemp=temperatuur;}
			  } else {
				  maxtemp=temperatuur;
				  alustatud=true;
			  }
			 } catch(Exception veaandmed){
				 puuduvaid++;
			 }
			}
			rida=lugeja.readLine();
		}
		System.out.println("Kuu nr "+kuu+" suurim temperatuur "+maxtemp);
		if(puuduvaid>0){
			System.out.println("Puudu "+puuduvaid);
		}
		lugeja.close();
	}
}