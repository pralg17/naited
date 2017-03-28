public class HarilikSummeerija implements Summeerija{
	//Loo uus muutuja summa hoidmise tarbeks
	int summa=0;
	public void lisa(int kogus){
		//Suurenda muutujat uue koguse jagu		
		summa+=kogus;
	}
	public int kysi(){
		//tagasta meelespeetud summa
		return summa;
//		return -1;
	}
}