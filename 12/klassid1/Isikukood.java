public class Isikukood{
	String kood;
	static final String[] kuunimed={"jaanuar", "veebruar", "märts", 
	  "aprill", "mai", "juuni", 
	  "juuli", "august", "september", 
	  "oktoober", "november", "detsember"};
	public Isikukood(String uusKood){
		if(uusKood.length()!=11){
			throw new RuntimeException("Vigane isikukoodi pikkus: "+uusKood.length());
		}
		kood=uusKood;
	}
	public boolean kasNaine(){
		return Integer.parseInt(kood.substring(0, 1)) % 2 == 0;
	}
	public String synnikuunimi(){
		return kuunimed[synnikuunr()-1];
	}
	public int synniaasta(){
		int sajand=18+(Integer.parseInt(kood.substring(0,1))-1)/2;
		return sajand*100+Integer.parseInt(kood.substring(1, 3));
	}
	public String synnikuupaev(){
		return kood.substring(5, 7);
	}
	public int synnikuunr(){
		return Integer.parseInt(kood.substring(3, 5));
	}
}