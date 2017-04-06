import java.util.*;
public abstract class SarnasteTekstideLeidja{
	List<String> tekstid=new ArrayList<String>();
	public void lisa(String tekst){tekstid.add(tekst);}
	public abstract double kysiTekstiOmadus(String tekst);
	public double[][] tekstideOmadused(){
	double[][] vastus=new double[tekstid.size()][2];
		for(int i=0; i<vastus.length; i++){
			vastus[i][0]=i;
			vastus[i][1]=kysiTekstiOmadus(tekstid.get(i));
		}
		return vastus;
	}
    public double[][] jarjestatudOmadused(){ //väljundis iga teksti nr ja omaduse väärtus
		double[][] andmed=tekstideOmadused();
		Arrays.sort(andmed, new Comparator<double[]>(){
			public int compare(double[] rida1, double[] rida2){
				return (int)(rida1[1]-rida2[1]);
			}
		});
		return andmed;
	}
	public double[][] kaugusedJargmisega(){
		double[][] andmed=jarjestatudOmadused();
		double[][] vastus=new double[andmed.length-1][3];
		for(int i=0; i<vastus.length; i++){
			vastus[i][0]=andmed[i][0];
			vastus[i][1]=andmed[i+1][0];
			vastus[i][2]=andmed[i+1][1]-andmed[i][1];
		}
		//System.out.println(Arrays.deepToString(vastus));
		//Järjesta tulemus pikkuste vahekauguse (tulba nr 2 järgi)
		Arrays.sort(vastus, new Comparator<double[]>(){
			public int compare(double[] rida1, double[] rida2){
				return (int)(rida1[2]-rida2[2]);
			}
		});	
		return vastus;
	}
	public String kysiTekst(int nr){
		return tekstid.get(nr);
	}
}