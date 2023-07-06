package com.bilgeadam.lesson023.trycatch;

/*
 * cheked exception ==> kontrol edilmesi zorunlu istisnalar  exception sınıfından extends alırlar
 * bir metot içinde checked exception fırlatıyor isek metotda fırlattıgımız 
 * exception turunu declare etmek zorundayız
 * ve metotdu kullandıgımız yerde bu metodu try catch içine almak zorundayız
 * 
 * uncheked exception==>  kontrol edilmesi zorunlu olmayan istisnalar run time 
 * excepiton sınıfından extends alırlar kontrol etmek zorunlu değildir fakat hatalı 
 * bir deger gireresek istisna fırlatacaktır 
 * 
 */
public class InfinityExceptionTest {

	public static void main(String[] args) {

		try {
			System.out.println(bolme(20, 0));

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("program çalışmaya devam ediyor");
		try {
			pozitifDegerlerToplami(5, -5);
		} catch (EksiDegerException e) {
			System.out.println("hata olustu " + e.toString());
		}

		System.out.println("2.kez program çalışmaya devam ediyor");
	}

	public static double bolme(double sayi1, double sayi2) throws InfinityException {

		if (sayi2 == 0) {
			throw new InfinityException("Sonsuzluk hatasi");
			// throw new ArithmeticException();
		}

		return sayi1 / sayi2;

	}

	public static int pozitifDegerlerToplami(int sayi1, int sayi2) {

		if (sayi1 < 0 || sayi2 < 0) {
			throw new EksiDegerException("girdiğimiz sayılar pozitif olmak zorundadır!!! ");

		}

		return sayi1 + sayi2;

	}

}
