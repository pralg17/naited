/*
  Looge Takisti klass, mille takistuse saab konstruktoris ette anda.
  Leia mitmesuguste takistite võimsus 5 ja 36 voldi juures
*/
public class Takisti extends Tarbija{
	double t;
	public Takisti(double takistus){
		if(takistus<0){throw new RuntimeException("negatiivne takistus");}
		t=takistus;
	}
	//Lisage teine konstruktor, millele antakse ette nimipinge ja -võimsus
	public Takisti(double nimipinge, double nimivoimsus){
		//double nimivool=nimivoimsus/nimipinge;
		this(nimipinge/(nimivoimsus/nimipinge));
	}
	public double kysiTakistus(){return t;}
}
