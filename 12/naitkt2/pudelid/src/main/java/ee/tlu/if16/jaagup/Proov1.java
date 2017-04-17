package ee.tlu.if16.jaagup;

public class Proov1{
	public static void proov(String[] arg){
		Jook j1=new Jook("Õlu", 0.90);
		Joogipudel p1=new Joogipudel();
		p1.maht=0.5;
		p1.tyyp=Pudelityyp.KLAAS;
		p1.pudelimass=0.25;
		p1.taarahind=0.1;
		p1.j=j1;
		System.out.println(p1.koguMass());
	}
}