public class Proov2{
	 public static void main(String[] args){
		 Isikukood jaagupikood=new Isikukood("37605030299");
		 Isik jaagup=new Isik("Jaagup", "Kippar", jaagupikood);
		 Isik paula =new Isik("Linda Pauline", "Kippar", "61009170132");
		 System.out.println(jaagup);
		 System.out.println(paula.toString());
		 //Lisage isikukoodile käsklused sünnikuu ja sünnikuupäeva küsimiseks
		 //Kasutage neid Isik-klassi toString meetodis
		 //nt. Mees Jaagup Kippar aastast 1976, synnipäev 03. mai
		 Isik[] isikud=new Isik[3];
		 isikud[0]=jaagup;
		 isikud[1]=paula;
		 isikud[2]=new Isik("Toomas", "Kippar", "50804250357");
		 for(int i=0; i<isikud.length; i++){
			 System.out.println(isikud[i]);
		 }
		 System.out.println("-----");
		 //Kuva välja kõik meesterahvad
		 for(int i=0; i<isikud.length; i++){
			 if(!isikud[i].isikukood.kasNaine()){
			   System.out.println(isikud[i]);				 
			 }
		 }
		 
	 }
}