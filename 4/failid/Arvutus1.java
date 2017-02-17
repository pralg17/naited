import java.io.*;
public class Arvutus1{
	public static void main(String[] args) throws IOException{
		BufferedReader failist=new BufferedReader(new FileReader("sisend1.txt"));
		if(!failist.readLine().equals("suurR,vaikeR,vaikeX")){
			throw new RuntimeException("tundmatu vorming");
		}
		String rida=failist.readLine();
		String[] m=rida.split(",");
		System.out.println("Suure raadius: "+m[0]+", väikese raadius "+m[1]+", väikese x:"+m[2]);
		PrintWriter faili1=new PrintWriter(new FileWriter("vastus1.txt"));
		double vaikeX=Double.parseDouble(m[2]);
		double vaikeR=Double.parseDouble(m[1]);
		double suurR=Double.parseDouble(m[0]);
	    if(Math.abs(vaikeX/suurR)<0.1){
			 faili1.println("suurR,vaikeR,vaikeX,porkeX,porkeY");
			 faili1.println(m[0]+","+m[1]+","+m[2]+","+m[2]+","+m[0]);
		} else if((vaikeX>vaikeR+suurR) || (vaikeX<-(vaikeR+suurR))){
			System.out.println("möödas");
		} else {
			double[] v=porkekoht(suurR, vaikeR, vaikeX);
			 faili1.println("suurR,vaikeR,vaikeX,porkeX,porkeY");
			 faili1.println(m[0]+","+m[1]+","+m[2]+","+v[0]+","+v[1]);
			//System.out.println("Nii kaugelt ei oska veel arvutada");
		}
		faili1.close();
	}
	public static double[] porkekoht(double suurR, double vaikeR, double vaikeX){
		double[] vastus=new double[2];
		//vorrandisüsteem - lõikuvad jooned vaikeX,vaikeY ning ring raadiusega suurR+vaikeR
		double vaikeY=Math.sqrt(Math.pow(vaikeR+suurR, 2)-Math.pow(vaikeX, 2));
		//double vektoripikkus=Math.sqrt(vaikeX*vaikeX+vaikeY*vaikeY);
		vastus[0]=vaikeX*suurR/(suurR+vaikeR);
		vastus[1]=vaikeY*suurR/(suurR+vaikeR);		
		return vastus;
	}
}