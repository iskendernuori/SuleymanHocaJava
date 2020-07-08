package day28overriding;

public class Mammal extends Animal { // extends i kaldrıırsak , age ve name i kullanamayız. cünkü onlar animal da
	
	public boolean birth = true;
	public String name= "Kedi";
	

	public static void main(String[] args) {
		Mammal mammal = new Mammal(); // obje oluşturduk

	}

	public void feed() {
		System.out.println("Yavrularini belser");
	}
	public Mammal() { // method oluşturduk
		// this içinde bulunduğunuz class daki variable ve methodlara ulaşmamızi sağlar
		
		
		System.out.println(this.birth); // this .. instance class a git demek. 
		this.feed();// yavrulari besler
		// child parent ilişkisi varsa this kullarak parent class daki
		// variable ve method lara ulaşabilirizi
		
		System.out.println(this.age);// parent class tan geldi 
		
		System.out.println(this.name);// parent class indan geldi
		this.move();// method olduğundan syso içine koymuyoruz.
		System.out.println(this.name); // this bulunduğu class tan cağırır. yukarıda name diye class ından dolayı
									   // "kedi" yi cağırır. Animal daki name kapatır. 
									   // Parent class lardaki variable ve methodlara ulaşmak için this kullanmayın.
									   //cunkü child ve parent daki ayni isimli variable methodlarda problem yaşayabilir.
									   // Parent class tan birşey alacaksak super kullnın.
		
		
									  // Genel kullanımda this class içindekiler içini, super parent daki için kullanılir.
									  // farklilik yapıp insanlari şaşırtmayin.
									  // Parantezsiz super parent lardaki variable ve method lara ulaşmanızı sağlar.
		
		System.out.println(super.age);  // super sadece parentlere ulaşmak için çalışır. bulunduğu class ta calışmaz
		
		System.out.println(super.name);
		super.move(); // parantezsiz this ve super başta kullanılmak şartları yok.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
