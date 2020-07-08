package day30exceptions;

public class TryCatch03 {

	public static void main(String[] args) {
		System.out.println(exceptions());
	}
	
	public static String exceptions() {
		String result = "";
		String v = null;
		
		try {
			try {
				result = result + "before"; //===> result = "before"
				v.length();   // NullPointerException alırız. alttaki satıri atlar catch e gecer.
				result = result + "after";
				
				
			}catch(NullPointerException e) {
				result = result + "catch";     //  ===> result = "beforecatch" olur 
				throw new RuntimeException();   // istediğimiz zaman exception atsın demek. catch olmadığından bir sonuc alınamaz.
				
			}finally {
				result = result +"finally";   // finally herzaman calışır. result = "beforecatchfinally" olur.
				throw new Exception();   // tekrar isteğe baplı hata. Catch oldğından sonrasında o yakalar. sonuna done ekler.
			}
		}catch(Exception e) {
			result = result + "done";   // 
		}
		return result;
	}
}
