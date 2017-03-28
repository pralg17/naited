import java.io.*;
public class FailiSalvestavSummeerija implements Summeerija{
	String failinimi;
	public FailiSalvestavSummeerija(String fnimi){
 	 failinimi=fnimi;
	 try{
		PrintWriter faili=new PrintWriter(new FileWriter(failinimi)); //kirjutab faili üle
		faili.close();
	 }catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public void lisa(int kogus){
	 try{
		PrintWriter faili=new PrintWriter(new FileWriter(failinimi, true)); //lisab faili
		faili.println(kogus);
		faili.close();
	 }catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public int kysi(){
	   try{
		  BufferedReader failist=new BufferedReader(new FileReader(failinimi));
		  int summa=0;
		  String rida=failist.readLine();
		  while(rida!=null){
			  summa+=Integer.parseInt(rida);
			  rida=failist.readLine();
		  }
		  return summa;
	   }catch(Exception ex){System.out.println(ex.getMessage());}
	   return -1;
	}
}