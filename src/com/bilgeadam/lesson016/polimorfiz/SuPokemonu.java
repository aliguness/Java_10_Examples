package com.bilgeadam.lesson016.polimorfiz;

public class SuPokemonu extends Pokemon {
	private int yuzmeHızı;
	private int suBasıncGucu;

	public SuPokemonu(int id, String ad, int guc, int can, int seviye, int yuzmeHızı, int suBasıncGucu) {
		super(id, ad, guc, can, seviye);
		this.yuzmeHızı = yuzmeHızı;
		this.suBasıncGucu = suBasıncGucu;
		setTur("Su");
	}

	public int getYuzmeHızı() {
		return yuzmeHızı;
	}

	public void setYuzmeHızı(int yuzmeHızı) {
		this.yuzmeHızı = yuzmeHızı;
	}

	public int getSuBasıncGucu() {
		return suBasıncGucu;
	}

	public void setSuBasıncGucu(int suBasıncGucu) {
		this.suBasıncGucu = suBasıncGucu;
	}

	@Override
	public void saldir() {
		System.out.println(getAd() + " adlı pokemon su saldırı yapıyor");
	}

	@Override
	public void pokedex() {
		super.pokedex();
		System.out.println("yuzme hızı" + yuzmeHızı);
		System.out.println("su Basınc Gucu" + suBasıncGucu);

	}
}
