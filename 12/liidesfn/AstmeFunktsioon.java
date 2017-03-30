public class AstmeFunktsioon implements Funktsioon{
	double aste;
	public AstmeFunktsioon(double aste){
		this.aste=aste;
	}
	public double f(double x){
		return Math.pow(x, aste);
	}
}