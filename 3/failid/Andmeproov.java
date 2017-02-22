import java.io.*;
public class Andmeproov{
	public static void main(String[] args) throws IOException{
		Andmeuuring uuring=new Andmeuuring("http://www.tlu.ee/~jaagup/andmed/ilm/harkutund.txt");
		System.out.println(uuring.maksimum(5));
	}
}