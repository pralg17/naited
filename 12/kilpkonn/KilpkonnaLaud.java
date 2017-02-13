public class KilpkonnaLaud{
	int[][] m=new int[10][10];
	public String kuva(Kilpkonn k){
		m[m.length-1-k.y][k.x]=1;
		StringBuffer sb=new StringBuffer();
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[0].length; j++){
				if(m[i][j]==0){sb.append('.');}
				else{sb.append('*');}
			}
			sb.append('\n');
		}
		return sb.toString();
	}
}