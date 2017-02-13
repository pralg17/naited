public class Proov1{
	public static void main(String[] args){
		Kilpkonn k1=new Kilpkonn();
		Kilpkonn k2=new Kilpkonn(5, 0, 2);
		System.out.println(k1);
		System.out.println(k2);
		k1.edasi();
		System.out.println(k1);
		k1.vasakule();
		k1.edasi();
		k1.edasi();
		System.out.println(k1);
		KilpkonnaLaud laud1=new KilpkonnaLaud();
		System.out.println(laud1.kuva(k1));
	}
}
/*
[jaagup@greeny kilpkonn]$ java Proov1
0, 0, >
5, 0, <
1, 0, >
Koosta klass KilpkonnaLaud, kus näha
kilpkonna asukoht laual suurusega 10x10.
*/