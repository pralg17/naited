public class Hello4{
  public static void main(String[] args){
	try{
     int arv1=Integer.parseInt(args[0]);
	 for(int i=0; i<arv1; i++){
	    System.out.print("*");
	 }
	} catch(Exception veaandmed){
	  System.out.println("Viga: "+veaandmed.getMessage());
	}
  }
}