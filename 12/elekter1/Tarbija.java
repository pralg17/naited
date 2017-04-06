public abstract class Tarbija{
	public abstract double kysiTakistus();
	public double vool(double pinge){return pinge/kysiTakistus();}
	public double v6imsus(double pinge){return pinge*vool(pinge);}
}