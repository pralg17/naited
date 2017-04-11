package jaagup;

public abstract class Pystkeha{
	double k;
	public Pystkeha(double korgus){
		k=korgus;
	}
	public abstract double pohjaPindala();
	public double ruumala(){
		return k*pohjaPindala();
	}
}