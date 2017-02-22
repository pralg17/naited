import java.util.*;
public class TulpadeAndmed{
	private int[] andmed;
	public TulpadeAndmed(int arv1, int arv2){
		andmed=new int[]{arv1, arv2};
	}
	public TulpadeAndmed(int arv1, int arv2, int arv3){
		andmed=new int[]{arv1, arv2, arv3};
	}
	public TulpadeAndmed(int[] andmemassiiv){
		this.andmed=andmemassiiv;
	}
	public int[] kysiAndmed(){
		return andmed;
	}
	@Override
	public String toString(){
		return Arrays.toString(andmed);
	}
	public int maksimum(){
		int suurim=andmed[0];
		for(int i=1; i<andmed.length; i++){if(andmed[i]>suurim){suurim=andmed[i];}}
		return suurim;
	}
}