public class Ristkylik{
	double a, b;
	public Ristkylik(double pikkus, double laius){
		if(pikkus<=0){throw new RuntimeException("Sobimatu pikkus");}
		if(laius <=0){throw new RuntimeException("Sobimatu laius");}
		a=pikkus;
		b=laius;
	}
	public double pindala(){
		return a*b;
	}
	//lisage funktsioon ristkyliku ymberm66du arvutamiseks
	public double ymberm66t(){
		return a+b+a+b;
	}
	public String toString(){
		return "Ristkylik "+a+"x"+b+"m, ymberm66t "+
		       ymberm66t()+"m, pindala "+pindala()+" ruutmeetrit.";
	}
}