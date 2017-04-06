/*
  Looge Takisti klass, mille takistuse saab konstruktoris ette anda.
  Leia mitmesuguste takistite võimsus 5 ja 36 voldi juures
*/
public class Takisti extends Tarbija{
	double t;
	public Takisti(double takistus){t=takistus;}
	public double kysiTakistus(){return t;}
}
