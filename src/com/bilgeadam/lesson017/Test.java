package com.bilgeadam.lesson017;

/*
 * Bir araç sınıfımız olsun 
 * 
 * Daha sonra ucak otomobil kanyom gemi gibi sınıflarımızıda olusturalım 
 * gerekirse bu sınıflarada altsınıf olusturabilirsiniz
 * hızlanma yavaslama gibi metotlarımız olsun 
 * kalkısyap() inisyap() yelkenac() limanayanas() sur()( kara taşıtları için dusunelim) gibi metotlarımız olsun 
 * bazı araclar yuk taşıyabilsinler bunun için yukal() ve yukbosalt() metotlarımız olsun 
 * bu uygumalyı olusturken ozelliklle interfacelerden yaralanalım 
 * 
 * 
 * kalkısaizinver metodu yazalım 
 * 
 * bir yukverme metodu yazalım dısardan aldıgımız 
 * nese bu metot içinde yukAl metodunu çalıştırsın 
 * 
 */
public class Test {
	public static void main(String[] args) {

		// Arac arac = new Arac();//
		Otomobil otomobil = new Otomobil();

		// Ucak ucak = new Ucak();
		// arac.hizlanma();
		otomobil.hizlanma();
		// ucak.hizlanma();
		Arac arac1 = new Kamyon();
		Arac arac2 = new YukGemisi();
		Arac arac3 = new YolcuGemisi();
		Arac arac4 = new KargoUcagi();
		Arac arac5 = new YolcuUcagi();
		Arac arac6 = new Otomobil();

		arac1.hizlanma();
		arac2.hizlanma();
		arac3.hizlanma();
		arac4.hizlanma();
		arac5.hizlanma();
		arac6.hizlanma();
		arac6.hizlanma();
		arac6.yavaslama();

		Ucak ucak1 = new YolcuUcagi();
		kalkisaİzinVer((Ucak) arac4);
		kalkisaİzinVer((Ucak) arac5);
		// kalkisaİzinVer((Ucak) arac6);
		kalkisaİzinVer(ucak1);
		yukVerme((Kamyon) arac1);

		IYuk arac7 = new YukGemisi();
		IYuk arac8 = new KargoUcagi();
		IYuk arac9 = new Kamyon();
		// IYuk arac10 = new YolcuUcagi();
		((Gemi) arac7).hizlanma();
		yukVerme(arac9);
		yukVerme(arac8);
		yukVerme(arac7);
		Helikopter helikopter = new Helikopter();
		kalkisaİzinVer(helikopter);

	}

	public static void kalkisaİzinVer(IHavaTasiti havaTasiti) {
		System.out.println("kalkısa izin verildi");
		havaTasiti.kalkisYap();
	}

	/*
	 * * bir yukverme metodu yazalım dısardan aldıgımız nese bu metot içinde yukAl
	 * metodunu çalıştırsın
	 * 
	 */

	public static void yukVerme(IYuk arac) {
		System.out.println("yük verildi");
		arac.yukAl();
	}

}
	
