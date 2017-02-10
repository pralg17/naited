public class Data2D{
	double _x;
	double _y;
	public Data2D(double x, double y){
		_x=x; _y=y;
	}
	public double distanceFromZero(){
		return Math.sqrt(_x*_x+_y*_y);
	}
	public String toString(){
		return "("+_x+", "+_y+")";
	}
}