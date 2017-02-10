public class Proov2{
	public static void main(String[] args){
		Data2D p1=new Data2D(3, 5);
		Data2D p2=new Data2D(4, 7);
		Data2D[] m=new Data2D[3];
		m[0]=p1;
		m[1]=p2;
		m[2]=new Data2D(-1, 1);
		for(Data2D p:m){
			System.out.println(p);
			System.out.println(p.distanceFromZero());
		}
 	}
}