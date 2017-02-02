public class Tervitus{
	public static void main(String[] arg){
		if(arg.length>0){
			System.out.println("Tere, "+arg[0]+"!");
		} else {
		    System.out.println("tere");
		}
		int vanus=5; 
		if(arg.length>1){
		  try{
			vanus=Integer.parseInt(arg[1]);
		  } catch(Exception ex){
			  System.out.println(arg[1]+" arvuna arusaamatu");
			  //System.out.println(ex.getMessage());
		  }
		}
		if(vanus<7){
			System.out.println("Tasuta");
		} else {
			System.out.println("Osta pilet");
		}
	}
}
//Harjutus: kuvage käsurealt sisestatud kahe arvu korrutis