public class Massiiv1{	
	public static void main(String[] args){
		int[] massid={65, 58, 103, 87};
		System.out.println("Esimene: "+massid[0]);
		System.out.println("Elemente kokku: "+massid.length);
		System.out.println("Viimane: "+massid[massid.length-1]);
		int summa=0;
		for(int i=0; i<massid.length; i++){
			summa=massid[i]+summa;
		}
		System.out.println(summa);
		//Leidke keskmine mass
		System.out.println(summa*1.0/massid.length);
	}
}