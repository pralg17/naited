public class Kilpkonn{
	private int x, y, suund;
	KilpkonnaLaud laud;
	char[] kujundid={'>', 'v', '<', '^'}; //suunad
	public Kilpkonn(KilpkonnaLaud laud){
		x=y=suund=0;
		this.laud=laud;
	}
	public char kujund(){
		return kujundid[suund];
	}
	public int kysiX(){return x;}
	public int kysiY(){return y;}
	public String toString(){
		return x+", "+y+", "+kujund();
	}
	public void edasi(){
		laud.vanasseKohtaT2rn();
		if(suund==0){x++;}
		if(suund==1){y--;}
		if(suund==2){x--;}
		if(suund==3){y++;}
		laud.uudeKohtaSymbol();
	}
	public void paremale(){
		suund++;
		if(suund>3){suund=0;}
		laud.uudeKohtaSymbol();
	}
	public void vasakule(){
		paremale(); paremale(); paremale();
	}
}