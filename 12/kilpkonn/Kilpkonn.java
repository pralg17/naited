public class Kilpkonn{
	int x, y, suund;
	char[] kujundid={'>', 'v', '<', 'n'}; //suunad
	public Kilpkonn(){
		x=y=suund=0;
	}
	public Kilpkonn(int x, int y, int suund){
		if(x<0){throw new RuntimeException("x<0");}
		if(y<0){throw new RuntimeException("y<0");}
		if(suund<0 || suund>3){throw new RuntimeException("Lubamatu suund");}
		this.x=x; this.y=y; this.suund=suund;
	}
	public char kujund(){
		return kujundid[suund];
	}
	public String toString(){
		return x+", "+y+", "+kujund();
	}
	public void edasi(){
		if(suund==0){x++;}
		if(suund==1){y--;}
		if(suund==2){x--;}
		if(suund==3){y++;}
	}
	public void paremale(){
		suund++;
		if(suund>3){suund=0;}
	}
	public void vasakule(){
		paremale(); paremale(); paremale();
	}
}