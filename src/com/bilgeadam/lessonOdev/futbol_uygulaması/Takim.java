package com.bilgeadam.lessonOdev.futbol_uygulaması;

import java.util.ArrayList;
import java.util.List;

public class Takim {
	
	private String isim;
	private String sehir;
	private int stadyumKapasitesi;
	private List<Futbolcu> futbolcular;
	private TeknikHeyet teknikHeyet;
	private String taktik;
	
	
	public Takim(String isim, String sehir, int stadyumKapasitesi, List<Futbolcu> futbolcular, TeknikHeyet teknikHeyet,
			String taktik) {
		super();
		this.isim = isim;
		this.sehir = sehir;
		this.stadyumKapasitesi = stadyumKapasitesi;
		this.futbolcular = new ArrayList<>();
		this.teknikHeyet = new TeknikHeyet();
		this.taktik = "";
		
	}
	
	
	public void taktikBelirle(String taktik) {
		this.taktik = taktik;
	}
	
	public void kaleciEkle(Kaleci kaleci) {
		kaleci.setFormaNumarasi(1);
		futbolcular.add(kaleci);
	}
	
	public void defansOyucusuEkle(Futbolcu futbolcu) {
		futbolcu.setFormaNumarasi(futbolcular.size() + 2);
		futbolcular.add(futbolcu);
	}
	
	public void ortaSahaOyuncusuEkle(Futbolcu futbolcu) {
		futbolcu.setFormaNumarasi(futbolcular.size() + 2);
		futbolcular.add(futbolcu);
	}
	
	public void forvetOyuncusuEkle(Futbolcu futbolcu) {
		futbolcu.setFormaNumarasi(futbolcular.size() + 2);
		futbolcular.add(futbolcu);
	}
	

}
