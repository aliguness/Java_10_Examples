package com.bilgeadam.ucakAppMarathon;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Urun {

	private String urunAdi;
	private double urunFiyatı;

	public Urun(String urunAdi, double urunFiyatı) {
		super();
		this.urunAdi = urunAdi;
		this.urunFiyatı = urunFiyatı;
	}

	@Override
	public String toString() {
		return "Urun [urunAdi=" + urunAdi + ", urunFiyatı=" + urunFiyatı + "]";
	}

	public String getUrunAdi() {
		return urunAdi;
	}

	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}

	public double getUrunFiyatı() {
		return urunFiyatı;
	}

	public void setUrunFiyatı(double urunFiyatı) {
		this.urunFiyatı = urunFiyatı;
	}

	public static void main(String[] args) {
		List<Urun> urunler = new ArrayList<>(
				List.of(new Urun("Sutas Ayran", 30), new Urun("Ekici Peynir", 200), new Urun("Çaykur", 150)));

		urunler.stream().filter(x -> x.getUrunFiyatı() < 100)
				.collect(Collectors.toMap(x -> x.getUrunAdi(), x -> x.getUrunFiyatı()))
				.forEach((k, v) -> System.out.println(k + "==>" + v));

		Map<String, Double> map = urunler.stream().filter(x -> x.getUrunFiyatı() < 100)
				.collect(Collectors.toMap(x -> x.getUrunAdi(), x -> x.getUrunFiyatı()));

	}

}
