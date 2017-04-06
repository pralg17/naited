import java.util.*;
public class Kasutus1{
	public static void main(String[] arg){
		//SarnasteTekstideLeidja leidja1=new SarnasePikkusegaTekstideLeidja();
		SarnasteTekstideLeidja leidja1=new SarnaseAlgusegaTekstideLeidja();
		leidja1.lisa("Madalaim õhutemperatuur on 8 kraadi");
		leidja1.lisa("Madis tuli kooli");
		leidja1.lisa("Juku tuli kooli");
		leidja1.lisa("Anu tuli kooli");
		leidja1.lisa("Keskmine õhutemperatuur on 15 kraadi");
		double[][] vastused=leidja1.tekstideOmadused();
		System.out.println(Arrays.deepToString(vastused));
		double[][] vastused2=leidja1.jarjestatudOmadused();
		System.out.println(Arrays.deepToString(vastused2));
		double[][] vastused3=leidja1.kaugusedJargmisega();
		System.out.println(Arrays.deepToString(vastused3));
		for(int i=0; i<vastused3.length/2+1; i++){
			System.out.println(leidja1.kysiTekst((int)vastused3[i][0])+"/"+
			                   leidja1.kysiTekst((int)vastused3[i][1]));
		}
	}
}