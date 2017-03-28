package summeerimine;
public class HarilikSummeerija implements Summeerija{
	int summa=0;
	public void lisa(int kogus){
		summa+=kogus;
	}
	public int kysi(){
		return summa;
	}
}