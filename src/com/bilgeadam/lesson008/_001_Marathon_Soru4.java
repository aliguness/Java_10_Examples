package com.bilgeadam.lesson008;

/*
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	No enclosing instance of type _001_Marathon_Soru4 is accessible. Must qualify the allocation with an enclosing instance of type _001_Marathon_Soru4 (e.g. x.new A() where x is an instance of _001_Marathon_Soru4).

	at com.bilgeadam.lesson008._001_Marathon_Soru4.main(_001_Marathon_Soru4.java:6)

 * sürekli yukarıdaki hata'yı aldım bir türlü düzeltemedim. En sonunda hatayı internette arattım anlatılana göre yaptım.
 * mantıksal olarak tam çözemedim hatayı.  kısacası örneğin üzerinden bir örnek daha oluşturmam gerekliymiş ama kafam karıştı iyice...
 * 
 * yazılan gibi +1 örnek daha ekleyince .
 */

public class _001_Marathon_Soru4 {
	
	public static void main(String[] args) {
		_001_Marathon_Soru4 program = new _001_Marathon_Soru4(); 		// şu kısmı ekledim. böyle yapmak çözümmüş fakat istediğimi oluşturmadı.
		CustomStringTR ifade = program.new CustomStringTR("Merhaba, dünya!");
		
		
		System.out.println(ifade.karakter(2));
		System.out.println(ifade.ekle(" Nasılsın?"));
		System.out.println(ifade.esitMi("merhaba, dünya!"));
		System.out.println(ifade.indeksOf("dünya"));
		System.out.println(ifade.uzunluk());
		System.out.println(ifade.degistir("Merhaba", "Merhaba-2"));
		System.out.println(ifade.altMetin(0, 7));
		System.out.println(ifade.kucukHarf());
		System.out.println(ifade.buyukHarf());
		System.out.println("      " + ifade + "   "+ifade.bosluklariSil() + "   ");
		
	}
	
	public class CustomStringTR{
		private String ifade;
		
		public CustomStringTR(String ifade) {
			this.ifade = ifade;
		}
		
		public CustomStringTR degistir(String eski, String yeni) {
			
			return new CustomStringTR(ifade.replace(eski, yeni));
		}

		public char karakter(int indeks) {
			return ifade.charAt(indeks);
		}
		public CustomStringTR ekle(String digerIfade) {
			return new CustomStringTR(ifade.concat(digerIfade));
		}
		public boolean esitMi(String digerIfade) {
			return ifade.equals(digerIfade);
		}
		public int indeksOf(String aranan) {
			return ifade.indexOf(aranan);
		}
		public int uzunluk() {
			return ifade.length();
		}
		public CustomStringTR altMetin(int baslangic, int bitis) {
			return new CustomStringTR(ifade.substring(baslangic, bitis));
		}
		public CustomStringTR kucukHarf() {
			return new CustomStringTR(ifade.toLowerCase());
		}
		public CustomStringTR buyukHarf() {
			return new CustomStringTR(ifade.toUpperCase());

		}
		public CustomStringTR bosluklariSil() {
			return new CustomStringTR(ifade.trim());
			
		}
	}

}
