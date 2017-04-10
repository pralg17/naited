public class Kasutus2{
	public static void main(String[] arg){
		Tarbija t=new Takisti(12, 55);
		System.out.println(t.v6imsus(10));
		System.out.println(t.v6imsus(14.4));
		JadaYhendus ahel=new JadaYhendus();
		ahel.lisa(t);
		ahel.lisa(new Takisti(12, 1000));
		System.out.println(ahel.v6imsus(12));
		System.out.println(ahel.v6imsus(24));
		System.out.println(ahel.vool(24));
		System.out.println("Pinge pirnil "+ahel.vool(24)*t.kysiTakistus());
		System.out.println("Pirni v6imsus "+
		   t.v6imsus(ahel.vool(24)*t.kysiTakistus()));
	}
}