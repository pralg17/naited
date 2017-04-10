public class Punktid4{
  public static void main(String argumendid[]){
    Punkt4 p=new Punkt4(3, 4);
    Punkt4 p2=new Punkt4(6, 8);
    System.out.println(p.kirjutaAndmed());
    System.out.println("Kaugus koordinaatide alguspunktist= "+
                        p.kaugusNullist());
    System.out.println("Kaugus koordinaatide alguspunktist= "+
                        p2.kaugusNullist());
  }
}