public class Isik{
	String eesnimi;
	String perekonnanimi;
	Isikukood isikukood;
	public Isik(String eesnimi, String perekonnanimi, Isikukood isikukood){
		if(eesnimi==null || eesnimi.length()==0){
			 throw new RuntimeException("Eesnimi puudub");
		}
		if(perekonnanimi==null || perekonnanimi.length()==0){
			 throw new RuntimeException("Perekonnanimi puudub");
		}
		this.eesnimi=eesnimi; this.perekonnanimi=perekonnanimi;
		this.isikukood=isikukood;
	}
	public Isik(String eesnimi, String perekonnanimi, String isikukoodistring){
		this(eesnimi, perekonnanimi, new Isikukood(isikukoodistring));
	}
	@Override
	public String toString(){
		 return (isikukood.kasNaine()?"Naine ":"Mees ")+
		   eesnimi+" "+perekonnanimi+" aastast "+isikukood.synniaasta()+
		    ", kuupaev "+isikukood.synnikuupaev()+"."+isikukood.synnikuunimi();
	}
}