import java.io.*;
import java.util.*;
public class Kasutus1{
	public static List<Tarbija> lubatudTarbijad(Tarbija[] tarbijad, double pinge, double maxv6imsus){
		List<Tarbija> vastus=new ArrayList<Tarbija>();
		for(Tarbija t:tarbijad){
			if(t.v6imsus(pinge)<=maxv6imsus){vastus.add(t);}
		}
		return vastus;
	}
	public static void main(String[] arg){
		Tarbija t1=new Takisti220Oomi();
		System.out.println(t1.v6imsus( 5));
		System.out.println(t1.v6imsus(36));
		Tarbija t2=new Takisti(5000);
		System.out.println(t2.v6imsus(36));		
		List<Tarbija> lubatud=lubatudTarbijad(new Tarbija[]{t1, t2, new Takisti(3000)}, 36, 0.5);
		for(Tarbija t: lubatud){
			System.out.println(t.kysiTakistus());
		}
	}
}