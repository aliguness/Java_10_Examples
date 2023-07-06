package com.bilgeadam.lesson017;

/*
 * 
 * ucaklarda hiz 50 ser 50 ser artsın ve azalsın
 * gemilerde hiz 10 ar 10 ar artsın ve azalsın
 * otomobillerde hız 20ser 20ser artsın ve azalsın
 * kamyonlarda hiz 5 er 5 er artsın ve azalsın
 * 
 */

public abstract class Arac implements IHareket{
	
	int hiz;

//	@Override
	public abstract void hizlanma(); 
	//	System.out.println(getClass().getSimpleName() + " hızlanıyor");  //hangi sınıftan olduğumuzu bumak için
	

//	@Override
	public abstract void yavaslama(); 
	//	System.out.println(getClass().getSimpleName() + " yavaslıyor"); 
		
	public void hizGoster() {
		System.out.println("hızınız==>" + hiz);
	}


	@Override
	public String toString() {
		return "Arac [hiz=" + hiz + "]";
	}

}
