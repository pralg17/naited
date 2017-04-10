public class Kasutus3{
	public static void main(String[] arg){
		JadaYhendus jadadejada=new JadaYhendus();
		for(int jadanr=0; jadanr<4; jadanr++){
			JadaYhendus jada=new JadaYhendus();
			for(int pirninr=0; pirninr<5; pirninr++){
				jada.lisa(new Takisti(12, 55));
			}
			jadadejada.lisa(jada);
		}
		System.out.println(jadadejada.v6imsus(220));
	}
}