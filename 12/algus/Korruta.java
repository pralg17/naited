public class Korruta{	
	public static void main(String[] arg){
	  if(arg.length==2){
		  //veapüünis try-catch ka juurde
		try{
		   System.out.println(Integer.parseInt(arg[0])*Integer.parseInt(arg[1]));
		} catch(NumberFormatException e){
		   System.out.println("Arvuteisendus ebaõnnestus");
		}
	  } else {
		  System.out.println("Kasuta kujul: java Korruta 4 6");		  
	  }
	}
}