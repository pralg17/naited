public class KilpkonnaLaud{
	Kilpkonn k;
	char[][] m=new char[10][10];
	public KilpkonnaLaud(){
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[0].length; j++){
				m[i][j]='.';
		    }
		}
		new Kilpkonn(this);
	}
	public void yhendaKilpkonn(Kilpkonn k){
		this.k=k;
	}
	public void vanasseKohtaT2rn(){
		m[m.length-1-k.kysiY()][k.kysiX()]='*';
	}
	public void uudeKohtaSymbol(){
		System.out.println(m);
		m[m.length-1-k.kysiY()][k.kysiX()]=k.kujund();
	}
	public Kilpkonn kysiKilpkonn(){
		return k;
	}
	public String toString(){
		StringBuffer sb=new StringBuffer();
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[0].length; j++){
				sb.append(m[i][j]);
			}
			sb.append('\n');
		}
		return sb.toString();
	}
}