import java.io.*;
public class AndmeteLooja{
	public static TulpadeAndmed kylmaPyhad(){
		 return new TulpadeAndmed(new int[]{20, 24, 25, 28});		
	}
	public static TulpadeAndmed arvudFailist(String failinimi, String eraldaja){
		int[] vastus=null;
		try{
			BufferedReader failist=new BufferedReader(new FileReader(failinimi));
			String[] m=failist.readLine().split(eraldaja);
			vastus=new int[m.length];
			for(int i=0; i<m.length; i++){vastus[i]=Integer.parseInt(m[i]);}
			failist.close();
		} catch(Exception ex){ex.printStackTrace();}
		return new TulpadeAndmed(vastus);
	}
}