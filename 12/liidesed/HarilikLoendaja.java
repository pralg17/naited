public class HarilikLoendaja implements Loendaja{
	//Tehke harilik, õigesti loendav loendaja
	//Veenduge kasutuse juures, et loendatakse õigesti
	int loendur=0;
	public void loenda(){loendur++;}
	public int kogus(){return loendur;}
}