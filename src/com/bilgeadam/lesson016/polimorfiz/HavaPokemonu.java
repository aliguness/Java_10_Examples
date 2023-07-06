package com.bilgeadam.lesson016.polimorfiz;

public class HavaPokemonu extends Pokemon implements IUcabilir, IDatabase {

	public HavaPokemonu(int id, String ad, int guc, int can, int seviye) {
		super(id, ad, guc, can, seviye);

	}

	@Override
	public void saldir() {
		System.out.println(getAd() + " hava saldırsı yapıyor");
	}

	@Override
	public void havalan() {
		System.out.println(getAd() + " havalanıyor");

	}

	@Override
	public void inisYap() {
		System.out.println(getAd() + " iniş yapıyor");

	}

	@Override
	public void save() {
		System.out.println(getAd() + "databse e kayıt edildi");

	}

}
