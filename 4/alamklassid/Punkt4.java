class Punkt4{
  int x, y;
  public Punkt4(){
    this(0, 0);
  }
  public Punkt4(int uus_x, int uus_y){
    x=uus_x;
    y=uus_y;
  }
  public String kirjutaAndmed(){
    return "x="+x+" y="+y;
  }
  public double kaugusNullist(){
    return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
  }
}