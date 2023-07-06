package com.bilgeadam.lesson032.factory.pizzaApp;

public class PizzaSiparis {

	public void menu() {

		System.out.println("Pizza Sipariş Menusu");
		Pizza pizza = pizzaSec3();
		sipraisHazirlama(pizza);

	}

	/*
	 * turu hamur tipini ve boyutu secip bir factory sınıfına yollayıp bize bir
	 * pizza donmesini istiyoruz
	 * 
	 * turu ve hamurtipini secelim
	 * 
	 * pizza Factory sınfında bir pizza olustur metodu yazıp bu metotdan aldıgımız
	 * verilerle bir pizza olustrup geri donelim
	 * 
	 * 
	 */
	private Pizza pizzaSec() {
		EBoyut boyut = boyutsec();
		ETur tur = turSec();
		EHamurTipi hamurTipi = hamurSec();
		return PizzaFactory.pizzaOlustur(boyut, tur, hamurTipi);
	}

	private EHamurTipi hamurSec() {
		for (EHamurTipi hamurTipi : EHamurTipi.values()) {
			System.out.println((hamurTipi.ordinal() + 1) + "-" + hamurTipi);
		}
		int secim = Utility.intDegerAlma("Lütfen bir hamur tipi seciniz");
		return EHamurTipi.values()[secim - 1];
	}

	public ETur turSec() {
		for (ETur tur : ETur.values()) {
			System.out.println((tur.ordinal() + 1) + "-" + tur);
		}
		int secim = Utility.intDegerAlma("Lütfen bir pizza turu seciniz");
		return ETur.values()[secim - 1];
	}

	public EBoyut boyutsec() {
		for (EBoyut boyut : EBoyut.values()) {
			System.out.println((boyut.ordinal() + 1) + "-" + boyut);
		}

		int secim = Utility.intDegerAlma("Lütfen bir pizza boyutu seciniz");

		return EBoyut.values()[secim - 1];
	}

	/// 2.yöntem
	private Pizza pizzaSec2() {
		EBoyut boyut = (EBoyut) secim(EBoyut.values(), "Lütfen bir Pizza boyutu Seciniz");
		ETur tur = (ETur) secim(ETur.values(), "Lütfen bir pizza türü seciniz");
		EHamurTipi hamurTipi = (EHamurTipi) secim(EHamurTipi.values(), "Lütfen bir hamur tipi seciniz");
		return PizzaFactory.pizzaOlustur(boyut, tur, hamurTipi);
	}

	public Enum secim(Enum[] dizi, String sorgu) {
		for (Enum deger : dizi) {
			System.out.println((deger.ordinal() + 1) + "-" + deger);
		}

		int secim = Utility.intDegerAlma(sorgu);
		return dizi[secim - 1];
	}

	// 3.yöntem
	public <T> T secim2(T[] dizi, String sorgu) {
		for (int i = 0; i < dizi.length; i++) {
			System.out.println((i + 1) + "-" + dizi[i]);
		}
		int secim = Utility.intDegerAlma(sorgu);
		return dizi[secim - 1];
	}

	private Pizza pizzaSec3() {
		EBoyut boyut = secim2(EBoyut.values(), "Lütfen bir Pizza boyutu Seciniz");
		ETur tur = secim2(ETur.values(), "Lütfen bir pizza türü seciniz");
		EHamurTipi hamurTipi = secim2(EHamurTipi.values(), "Lütfen bir hamur tipi seciniz");
		return PizzaFactory.pizzaOlustur(boyut, tur, hamurTipi);
	}

	private void sipraisHazirlama(Pizza pizza) {
		System.out.println("Siparişiniz ===>" + pizza);
		System.out.println("Hazırlanıyor.....");

	}

}