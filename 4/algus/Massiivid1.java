public class Massiivid1{
	public static void main(String[] args){
		if(args.length>0){			
			System.out.println("Viimane: "+args[args.length-1]);
		}
		//Olemasolu korral kuva välja eelviimane
		if(args.length>1){
			System.out.println("Eelviimane: "+args[args.length-2]);			
		}
		System.out.println("Loetelu:");
		for(String sona: args){
			System.out.println(sona);
		}
		//Kuvage kasutaja sisestatud arvude summa
		int summa=0;
		for(String sona: args){
			//System.out.println(sona);
			summa=Integer.parseInt(sona)+summa;
		}
		System.out.println(summa);
	}
}