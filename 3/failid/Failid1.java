import java.io.*;
public class Failid1{
	public static void main(String[] args) throws IOException{
		int kogus=10;
		if(args.length>0){
			kogus=Integer.parseInt(args[0]);
		}
		PrintWriter kirjutaja=new PrintWriter(new FileWriter("arvuruudud.txt"));
		for(int arv=1; arv<=kogus; arv++){
			kirjutaja.println(arv*arv);
		}
		kirjutaja.close();
	}
}
//Küsige kasutajalt, millise arvuni arvuruute kirjutada