package day10stringmethods;

public class StringMethod02Tekrar {

	public static void main(String[] args) {
		String str1 = "Sarkikaraagac";
		
		System.out.println(str1.lastIndexOf('a'));
		System.out.println(str1.lastIndexOf('k'));
		System.out.println(str1.lastIndexOf('b'));
		
		
		String str2 = "Sonsuzluktanbirhaberverluk";
		
		System.out.println(str2.lastIndexOf('u',6)); // ilk 6 indexin icindeki en sonki u nun son görünümüne bakar
		
		
		System.out.println(str2.lastIndexOf("luk"));// luk hecesinin en sonki görnumunu verir. son hece yani
		
		
		
		
		
		
		
		
		

	}

}
