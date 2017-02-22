public class AndmeteKuvaja{
	public static String vertikaalneTulpdiagramm(TulpadeAndmed andmed, int nihe, int tulbalaius){
		 StringBuffer sb=new StringBuffer();
		 //System.out.println(andmed.maksimum());
		 for(int rida=andmed.maksimum(); rida>0; rida--){
			 //System.out.println(rida+sb.toString());
			 for(int i=0; i<nihe; i++){sb.append(" ");}
			 for(int tulbanr=0; tulbanr<andmed.kysiAndmed().length; tulbanr++){
				// System.out.println(andmed.kysiAndmed().length+" "+andmed.kysiAndmed()[tulbanr]);
				 if(rida<=andmed.kysiAndmed()[tulbanr]){
					 for(int i=0; i<tulbalaius; i++){sb.append("*");}
				 } else {
					 for(int i=0; i<tulbalaius; i++){sb.append(" ");}					 
				 }
			 }
			 sb.append("\n");
		 }
		 return sb.toString();
	}
}