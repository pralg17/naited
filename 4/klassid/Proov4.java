public class Proov4{	
    //Koostage alamprogramm, mis saab sisendiks
	//punktimassiivi ja punkti.
	//tagastatakse massiivis olev 
	//kaugeim punkt ettantud punktist
	public static Data2D farestPoint(Data2D[] a, Data2D p){
		Data2D max=a[0];
		for(int i=1; i<a.length; i++){
			if(a[i].distanceFromPoint(p).distanceFromZero()>
			    max.distanceFromPoint(p).distanceFromZero()){
			  max=a[i];
			}
		}
		return max;
	}
	public static void main(String[] args){
		Data2D p1=new Data2D(3, 5);
		Data2D p2=new Data2D(4, 7);
		Data2D[] m=new Data2D[5];
		m[0]=p1;
		m[1]=p2;
		m[2]=new Data2D(-3, 5);
		m[3]=new Data2D(11, 5);
		m[4]=new Data2D(-3, 8);		
		Data2D vastus=farestPoint(m, m[2]);
		System.out.println(vastus);
		Data2D v=p1.distanceFromPoint(p2);
		System.out.println(v);
		System.out.println(v.distanceFromZero());
		System.out.println(
		 p1.distanceFromPoint(p2).distanceFromZero()
		);
	}
}