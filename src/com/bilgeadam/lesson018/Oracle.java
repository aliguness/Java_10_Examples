package com.bilgeadam.lesson018;

public class Oracle  implements IDatabase{

	@Override
	public void veriEkle() {
System.out.println("MySql veri eklendi");		
	}

	@Override
	public void veriSil() {
System.out.println(" MySql Veri silindi");		
	}

	@Override
	public void veriGuncelle() {
		System.out.println("MySql veri güncellendi");		
		
	}

	@Override
	public void verileriGetir() {
		System.out.println("MySql veri getirildi.");		
		
	}

	@Override
	public void login() {
		System.out.println("MySql veri girildi.");		
		
	}

}
