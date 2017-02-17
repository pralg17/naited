import java.io.*;
public class Lugemine1{
	public static void main(String[] args) throws IOException{
		BufferedReader failist=new BufferedReader(new FileReader("sisend1.txt"));
		System.out.println(failist.readLine());
		String rida=failist.readLine();
		String[] m=rida.split(",");
		System.out.println("Suure raadius: "+m[0]+", väikese raadius "+m[1]+", väikese x:"+m[2]);
	}
}