import java.io.*;
public class Failid3{
	public static void main(String[] args) throws IOException{
		BufferedReader lugeja=new BufferedReader(
		  new FileReader("eesnimed.txt")
		);
		PrintWriter kirjutaja=new PrintWriter(new FileWriter("eesnimed2.txt"));
		String rida=lugeja.readLine();
		int loendur=0;
		while(rida!=null){
			loendur++;
			kirjutaja.println(loendur+"."+rida);
			rida=lugeja.readLine();
		}
		lugeja.close();
		kirjutaja.close();
		System.out.println("Failist leiti "+loendur+" rida");
	}
}