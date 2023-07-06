package com.bilgeadam.lesson016.polimorfiz;

public class AtesPokemonu extends Pokemon {

	private int yakicilikGucu;

	public AtesPokemonu(int id, String ad, int guc, int can, int seviye, int yakicilikGucu) {
		super(id, ad, guc, can, seviye);
		this.yakicilikGucu = yakicilikGucu;
		setTur("Ateş");
	}

	public int getYakicilikGucu() {
		return yakicilikGucu;
	}

	public void setYakicilikGucu(int yakicilikGucu) {
		this.yakicilikGucu = yakicilikGucu;
	}

	@Override
	public void saldir() {
		System.out.println(getAd() + " adlı pokemon ateş saldırısı yapıyor");
	}

}
