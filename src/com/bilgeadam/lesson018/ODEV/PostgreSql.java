package com.bilgeadam.lesson018.ODEV;

public class PostgreSql extends Database {
	@Override
	public void veriEkle() {
		System.out.println("Postgresql veri tabanına veri eklendi");

	}

	@Override
	public void veriSil() {
		System.out.println("Postgresql veri tabanından veri silindi");

	}

	@Override
	public void veriGuncelle() {
		System.out.println("Postgresql veri tabanında veri guncellendi");

	}

	@Override
	public void verileriGetir() {
		System.out.println("Postgresql veri tabanından veriler getirildi");

	}

	@Override
	public void login() {
		System.out.println("Postgresql veri tabanına  bağlanıldı");

	}
}
