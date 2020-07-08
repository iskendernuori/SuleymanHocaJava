package day33interface;

public interface IcAraba {
	
	int price =2000; 
	boolean old=true;
	
	public void direksiyon();
	
	public void koltuk();
	
	public void klima();

	public default void doseme() {// java 8 den sonra gelen ozellik. default veya static ile ollyor
		System.out.println("Interface default keyword ile doseme yaptim.");
	// default keywordunu kullandiysak body eklemek zorundayiz. aksi halde CompileTime Error alirsiniz	
		
	}
	public static void isitma() {//static keywordunu kullandiysak body eklemek zorundayiz. aksi halde CompileTime Error alirsiniz	
		System.out.println("Interface ile static keyword ile isitma yaptım");
	}
}
