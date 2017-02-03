public class Arvutus2{
   public static void main(String[] a){
      int arv1=Integer.parseInt(a[0]);
      int arv2=Integer.parseInt(a[1]);
	  int tulemus=-1;
	  if(arv1>arv2){tulemus=arv1-arv2;}
	  else{tulemus=arv2-arv1;}
	  System.out.println(tulemus);
   }
}