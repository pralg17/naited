public class Jook{
	String nimetus;
	double omahind;
	double erikaal;
	public Jook(String nimetus, double omahind, double erikaal){
		if(nimetus==null || nimetus.length()==0){
			throw new RuntimeException("Nimetus puudub");
		}
		this.nimetus=nimetus; 
		this.omahind=omahind;
		this.erikaal=erikaal;
	}
	public Jook(String nimetus, double omahind){
		this(nimetus, omahind, 1);
	}
}