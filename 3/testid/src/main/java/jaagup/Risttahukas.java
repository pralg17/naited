package jaagup;

public class Risttahukas extends Pystkeha{
	double p, l;
	public Risttahukas(double pikkus, double laius, double korgus){
		super(korgus);
		p=pikkus;
		l=laius;
	}
	@Override
	public double pohjaPindala(){
		return l*p;
	}
} //Lisage klass ja testid silindri tarbeks