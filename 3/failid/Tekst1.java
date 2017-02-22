public class Tekst1{
	public static void main(String[] args){
		String andmerida="2017-02-14 13:45;486;487;485";
		String[] m=andmerida.split(";");
		String[] m2=m[0].split(" ");
		String[] m3=m2[1].split(":");
		System.out.println(m3[0]+" tundi ja "+m3[1]+" minutit.");
		System.out.println(m[0]);
		System.out.println(m[1]);
		System.out.println(m[2]);
		System.out.println(m[3]);
		int a1=Integer.parseInt(m[1]);
		int a2=Integer.parseInt(m[2]);
		int a3=Integer.parseInt(m[3]);
		double keskmine=(a1+a2+a3)/3.0;
		System.out.println(keskmine);
		//Kuvage eraldi tunnid ja eraldi minutid
	}
}