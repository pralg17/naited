class Punktid4c{
  public static void main(String argumendid[]){
    int pArv=3;
    Punkt4 pd[] = new Punkt4[pArv];
    pd[0]=new Punkt4(2, 1);
    pd[1]=new Punkt4Laiend();
    pd[2]=new Punkt4(5, 5);
    for(int nr=0; nr<pArv; nr++){
      if(pd[nr] instanceof Punkt4Laiend)
        ((Punkt4Laiend)pd[nr]).liiguParemale();
    }
    for(int nr=0; nr<pArv; nr++){
      System.out.println(pd[nr].kirjutaAndmed());
    }
    
  }
}