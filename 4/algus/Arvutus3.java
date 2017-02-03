public class Arvutus3{
   public static void main(String[] a){
	 try{
      int arv1=Integer.parseInt(a[0]);
      int arv2=Integer.parseInt(a[1]);
	  int tulemus=-1;
	  if(arv1>arv2){tulemus=arv1-arv2;}
	  else{tulemus=arv2-arv1;}
	  System.out.println(tulemus);
	  System.out.println(arv1/arv2);
	 } catch(ArrayIndexOutOfBoundsException veaandmed){
		System.out.println("Puuduv sisend");
	 } catch(NumberFormatException veaandmed){
		System.out.println("Sisend pole arv");	
	 } catch(Exception veaandmed){
		System.out.println("Tekkis viga: "+veaandmed.getMessage());
		System.out.println("Viga: "+veaandmed.getClass().getName());
	 }
   }
}