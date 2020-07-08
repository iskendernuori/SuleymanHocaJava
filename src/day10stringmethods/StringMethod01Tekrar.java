package day10stringmethods;

public class StringMethod01Tekrar {

	public static void main(String[] args) {
		String str1 = "Karakartal Yuvayi Terketti";
		
		System.out.println(str1.indexOf('l'));
		System.out.println(str1.indexOf('Y'));
		System.out.println(str1.indexOf('T'));
		System.out.println(str1.indexOf('t'));
		System.out.println(str1.indexOf('i'));
		System.out.println(str1.indexOf('v'));
		
		
		
		System.out.println(str1.indexOf('a',7));
		System.out.println(str1.indexOf('t',22));
		System.out.println(str1.indexOf('v',16));
		
		System.out.println(str1.indexOf("ak"));
		System.out.println(str1.indexOf("et"));
		
		String str2 = "Sarikanarya";
		
		int indx = str2.indexOf('a',4);
		System.out.println(str2.indexOf('a', +indx));
		
		String str3 =  "Missisippi";
		System.out.println(str3.indexOf("sis"));
		
		

		
		
		
		
		
		
		
	}

}
