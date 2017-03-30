public class KordajaFunktsioon implements Funktsioon{
	double kordaja;
	public KordajaFunktsioon(double kordaja){
		this.kordaja=kordaja;
	}
	public double f(double x){
		return x*kordaja;
	}
}