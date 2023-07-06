package com.bilgeadam.lesson018.sehir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * sehir sınfında isim plaka ve nufus degerleimiz olsun 
 *  plaka kodu uret diye bir metot 01,02...09,10,11
 *  rastgelenufusolustur diye bir metot yazalım 
 * 
 * 
 * uygulama sınıfında bir sehir listesi olusturacagız 
 * bir sehirleri olustur metodu ile string arrayden gelen verilei sehir nesnesine cevirip
 * sehiler listesine ekleyeceğiz
 * 
 */
public class Uygulama {

	ArrayList<Sehir> sehirler;

	public Uygulama() {
		this.sehirler = new ArrayList<>();
	}

	public void sehirOlustur() {
		// this.sehirler = new ArrayList<>();
		for (int i = 0; i < SehirDatabase.iller.length; i++) {
			String isim = SehirDatabase.iller[i];
			Sehir sehir = new Sehir(isim);

			sehirler.add(sehir);
		}

	}

	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();
		uygulama.sehirOlustur();
		System.out.println(uygulama.sehirler);
		
		Comparator<Sehir> nufusaGore =new Comparator<Sehir>() {

			@Override
			public int compare(Sehir o1, Sehir o2) {
				
				return (int) (o1.getNufus()- o2.getNufus());
			}
		};
		
		Collections.sort(uygulama.sehirler, nufusaGore);
		for (Sehir sehir : uygulama.sehirler) {
			System.out.println(sehir);
		}
		System.out.println("Karışık liste");
		Collections.shuffle(uygulama.sehirler);

		Comparator<Sehir> ismeGore = new Comparator<Sehir>() {
			@Override
			public int compare(Sehir o1, Sehir o2) {
				return o1.getIsim().compareTo(o2.getIsim());
			}
		};
		Collections.sort(uygulama.sehirler, ismeGore);
		for (Sehir sehir : uygulama.sehirler) {
			System.out.println(sehir);
		}
	}

}
