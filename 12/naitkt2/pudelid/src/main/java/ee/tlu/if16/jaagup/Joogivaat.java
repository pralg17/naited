package ee.tlu.if16.jaagup;

public class Joogivaat{
	double vaadimaht;
	double taidetudmaht;
	Jook j;
	Joogipudel villi(Joogipudel pudel){
		if(pudel.j!=null){return null;} //pudel juba täis, villimine ei õnnestunud
		if(pudel.maht<=taidetudmaht){
			taidetudmaht-=pudel.maht;
			pudel.j=j; //Pudelisse sama jook mis vaadis
			return pudel;
		}
		return null; //Vaadis pole piisavalt jooki;
	}
}