public class KilpkonnaLaud{
	Kilpkonn k;
	char[][] m=new char[10][10];
	public KilpkonnaLaud(){
		k=new Kilpkonn(this);
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[0].length; j++){
				m[i][j]='.';
		    }
		}
	}
	public void vanasseKohtaT2rn(){
		m[k.kysiY()][k.kysiX()]='*';
	}
	public void uudeKohtaSymbol(){
		m[k.kysiY()][k.kysiX()]=k.kujund();
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