public class Proov1{
	public static void main(String[] args){
		TulpadeAndmed poisteMassid=new TulpadeAndmed(35, 53, 28);
		System.out.println(poisteMassid);
		System.out.println(poisteMassid.maksimum());
		System.out.println(AndmeteLooja.kylmaPyhad());
		TulpadeAndmed vanusteTulbad=AndmeteLooja.arvudFailist("vanused.txt", ",");
		System.out.println(vanusteTulbad);
		System.out.println(vanusteTulbad.maksimum());
//		System.out.println(AndmeteKuvaja.vertikaalneTulpdiagramm(
//		    AndmeteLooja.kylmaPyhad(), 0, 1));
        System.out.println(AndmeteKuvaja.vertikaalneTulpdiagramm(new TulpadeAndmed(3, 5), 0, 1));
	}
}