public class Hello2{
  public static void main(String[] args){
     if(args.length>0){
	   System.out.println("Tere, "+args[0]);
	 }
	 if(args.length>1){
		 System.out.println(args[1]+" "+args[0]);
	 }
	 System.out.println("Argumente kokku: "+args.length);
	 for(String arg: args){
		 //System.out.println(arg);
		 System.out.println(arg.substring(0, 1));
	 }
  }
}