public class Alamprogrammid2{
	public static double summa(double[] m){
		double vastus=0;
		for(double a: m){
			vastus+=a;
		}
		return vastus;
	}
	//Koostage alamprogramm massiivi väärtuste 
	//aritmeetilise keskmise leidmiseks
	public static double keskmine(double[] m){
		return summa(m)/m.length;
	}
	public static void main(String[] args){
	   double[] kehakaalud={80, 65, 100};
	   System.out.println(summa(kehakaalud));
	   System.out.println(keskmine(kehakaalud));
	   System.out.println(Alamprogrammid.ymarda(keskmine(kehakaalud), 2));
	   System.out.println("Esimene: "+kehakaalud[0]);
	   System.out.println("Kogus: "+kehakaalud.length);	   
	   System.out.println("Viimane: "+kehakaalud[kehakaalud.length-1]);	
       for(int i=0; i<kehakaalud.length; i++){
		   System.out.println(i+": "+kehakaalud[i]);
	   }	   
	   for(double kehakaal: kehakaalud){
		   System.out.println(kehakaal);
	   }
	}
}
/*
[jaagup@greeny algus]$ java Alamprogrammid2
245.0
81.66666666666667
81.67
Esimene: 80.0
Kogus: 3
Viimane: 100.0
0: 80.0
1: 65.0
2: 100.0
80.0
65.0
100.0

*/