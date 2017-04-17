public class Joogipudel{
	Jook j;
    double maht;
	Pudelityyp tyyp;
	double pudelimass;
	double taarahind;
	double koguMass(){
		if(j==null){return pudelimass;}
		return pudelimass+maht*j.erikaal;
	}
}