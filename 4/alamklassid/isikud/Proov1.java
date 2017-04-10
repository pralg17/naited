public class Proov1{
	public static void main(String[] arg){
		Inimene isik1=new Inimene();
		isik1.eesnimi="Juku";
		isik1.synniaasta=2009;
		Inimene isik2=new Inimene();
		isik2.eesnimi="Kati";
		isik2.synniaasta=2010;
		System.out.println(isik1.synniaasta);
		Inimene[] isikud=new Inimene[4];
		isikud[0]=isik1;
		System.out.println(isikud[0].eesnimi);
		isikud[1]=isik2;
		isikud[2]=new Inimene();
		isikud[2].eesnimi="Juhan";
		isikud[2].synniaasta=1947;
		isikud[3]=new Inimene();
		isikud[3].eesnimi="Marta";
		isikud[3].synniaasta=1949;
		for(Inimene isik: isikud){
			if(isik.synniaasta<1980){
				System.out.println(isik.eesnimi);
			}
		}
	}
}