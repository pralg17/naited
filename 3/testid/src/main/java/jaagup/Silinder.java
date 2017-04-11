package jaagup;

public class Silinder extends Pystkeha{
	double r;
	public Silinder(double raadius, double korgus){
		super(korgus);
		r=raadius;
	}
	@Override
	public double pohjaPindala(){
		return Math.PI*Math.pow(r, 2);
	}
}