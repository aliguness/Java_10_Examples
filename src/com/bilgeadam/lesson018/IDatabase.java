package com.bilgeadam.lesson018;

public interface IDatabase {  // burada abstract olarak da kullanabilirdik public abstract class IDatabase .  ve diğer sınıflar extends olarak alacak ( GERİYE DÖNÜK NOT )
	
	void veriEkle();
	void veriSil();
	void veriGuncelle();
	void verileriGetir();
	void login();
	

}
