public class Proov1{
	 public static void main(String[] args){
		 Isikukood jaagup=new Isikukood("37605030299");
		 Isikukood paula =new Isikukood("61009170132");
		 System.out.println(jaagup.kasNaine()+" "+jaagup.synniaasta());
		 System.out.println(paula.kasNaine()+ " "+ paula.synniaasta());
	 }
}