import java.util.*;
public class JadaYhendus extends Tarbija{
	List<Tarbija> elemendid=new ArrayList<Tarbija>();
	public void lisa(Tarbija t){
		elemendid.add(t);
	}
	public double kysiTakistus(){
		double summa=0;
		for(Tarbija t: elemendid){
			summa+=t.kysiTakistus();
		}
		return summa;
	}
}