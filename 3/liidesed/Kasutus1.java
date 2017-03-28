public class Kasutus1{
	public static void main(String[] args){
//		Summeerija ladu=null;
//		Summeerija ladu=new LibaSummeerija();
//		Summeerija ladu=new HarilikSummeerija();
		Summeerija ladu=new FailiSalvestavSummeerija("arvud1.txt");
		for(String s: args){
			ladu.lisa(Integer.parseInt(s));
		}
		System.out.println(ladu.kysi());
	}
}