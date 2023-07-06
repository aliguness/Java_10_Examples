package com.bilgeadam.lesson017;

public class Helikopter extends Arac implements IHavaTasiti{

	@Override
	public void kalkisYap() {
		System.out.println(getClass().getSimpleName()+ "Kalkış yapıyor");		
	}

	@Override
	public void inisYap() {
		System.out.println(getClass().getSimpleName()+ "iNiş yapılıyor");		
		
	}

	@Override
	public void hizlanma() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void yavaslama() {
		// TODO Auto-generated method stub
		
	}
	

}
