import java.io.*;
public class Failid2{
	public static void main(String[] args) throws IOException{
		BufferedReader lugeja=new BufferedReader(
		  new FileReader("eesnimed.txt")
		);
		String rida=lugeja.readLine();
		int loendur=0;
		while(rida!=null){
			loendur++;
			//kuvage loetud eesnimed ekraanile
			System.out.println(rida);
			//Kirjutage eesnimed koos järjekorranumbritega
			//teise tekstifaili
			rida=lugeja.readLine();
		}
		lugeja.close();
		System.out.println("Failist leiti "+loendur+" rida");
	}
}