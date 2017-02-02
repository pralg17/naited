public class Hello3{
   public static void main(String[] args){
      if(args.length==2){
	     int arv1=Integer.parseInt(args[0]);
	     int arv2=Integer.parseInt(args[1]);
		 System.out.println(arv1+arv2);
		 //Lahuta suuremast arvust väiksem
		 if(arv2>arv1){
			 System.out.println(arv2-arv1);			 
		 } else {
			 System.out.println(arv1-arv2);			 			 
		 }
	  }
   }
}