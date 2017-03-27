public class Kasutus1{
	public static void main(String[] arg){
//		Loendaja abiline=null;
//		Loendaja abiline=new LibaLoendaja();
		Loendaja abiline=new HarilikLoendaja();
		if(arg.length==1){
			for(int i=0; i<arg[0].length(); i++){
				if(arg[0].charAt(i)=='3'){
					abiline.loenda();
				}
			}
			System.out.println("Kolmesid kokku "+abiline.kogus());
		}
	}
}