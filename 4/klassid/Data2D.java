public class Data2D{
	private double _x;
	private double _y;
	public Data2D(double x, double y){
		_x=x; _y=y;
	}
	public double distanceFromZero(){
		return Math.sqrt(_x*_x+_y*_y);
	}
	public Data2D distanceFromPoint(Data2D p){	
	    return new Data2D(p.getX()-_x, p.getY()-_y);
	}
	public double getX(){return _x;}
	public double getY(){return _y;}
	public String toString(){
		return "("+_x+", "+_y+")";
	}
}