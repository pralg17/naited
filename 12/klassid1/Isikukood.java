public class Isikukood{
	String kood;
	public Isikukood(String uusKood){
		if(uusKood.length()!=11){
			throw new RuntimeException("Vigane isikukoodi pikkus: "+uusKood.length());
		}
		kood=uusKood;
	}
	public boolean kasNaine(){
		return Integer.parseInt(kood.substring(0, 1)) % 2 == 0;
	}
	//Lisage funktsioon neljakohalise sünniaasta väljastamiseks
	public int synniaasta(){
		int sajand=18+(Integer.parseInt(kood.substring(0,1))-1)/2;
		return sajand*100+Integer.parseInt(kood.substring(1, 3));
	}
}