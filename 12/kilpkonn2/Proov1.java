public class Proov1{
	public static void main(String[] args){
		KilpkonnaLaud laud=new KilpkonnaLaud();
		Kilpkonn k1=laud.kysiKilpkonn();
		k1.edasi();
		k1.edasi();
		k1.vasakule();
		k1.edasi();
		k1.edasi();
		k1.edasi();
		System.out.println(laud.toString());
		laud.salvestaFaili("seis.txt");
	}
}
/*

*/