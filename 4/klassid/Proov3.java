public class Proov3{
	public static void print(Data2D[] a){
		for(Data2D p:a){
			System.out.println(p);
			System.out.println(p.distanceFromZero());
		}		
	}
	public static double maxDist(Data2D[] a){
		double max=0;
		for(Data2D p:a){
			if(p.distanceFromZero()>max){max=p.distanceFromZero();}
		}
		return max;
	}
	public static Data2D maxDistPoint(Data2D[] a){
		Data2D max=a[0];
		for(int i=1; i<a.length; i++){
			if(a[i].distanceFromZero()>max.distanceFromZero()){
				max=a[i];
			}
		}
		return max;
	}
	//Kuvage ka lähim punkt
	public static Data2D minDistPoint(Data2D[] a){
		Data2D min=a[0];
		for(int i=1; i<a.length; i++){
			if(a[i].distanceFromZero()<min.distanceFromZero()){
				min=a[i];
			}
		}
		return min;
	}
	public static void main(String[] args){
		Data2D p1=new Data2D(3, 5);
		Data2D p2=new Data2D(4, 7);
		Data2D[] m=new Data2D[3];
		m[0]=p1;
		m[1]=p2;
		m[2]=new Data2D(-1, 1);
        print(m);
		System.out.println(maxDist(m));
		System.out.println(maxDistPoint(m));
		System.out.println(minDistPoint(m));
 	}
}