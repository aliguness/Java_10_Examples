package com.bilgeadam.lesson031;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * 1- kosucu sınıfı olusturacagız
 * kosucunun ismi mesefa,sure ,baslangıc zamanı olsun 
 * 
 * thread için bir metot yazalım ==> 
 * kosuscu 100 metre kosacak 
 * 1 er 1 er mesefa alacak 
 * ve her 10 metrede bir program cıktı verecek
 * mustafa==> 10.metrede
 * mustafa==> 20.metrede
 * 
 * metodun sonunda mustafa adlı kosucu 100 metreyi 2000 milisaniyeede kostu
 * 
 * yarıs sınıfımızdada 5 tane kosucu olusturup thread olarak çalıstıralaım 
 * 
 * 
 */
public class YuzMetreYarisi {

	public static void main(String[] args) {
		long baslangicZamani = System.nanoTime();
		Kosucu kosucu1 = new Kosucu("Serkan", baslangicZamani, 1);
		Kosucu kosucu2 = new Kosucu("Burak", baslangicZamani, 1);
		Kosucu kosucu3 = new Kosucu("Caner", baslangicZamani, 1);
		Kosucu kosucu4 = new Kosucu("Mustafa", baslangicZamani, 1);
		Kosucu kosucu5 = new Kosucu("Onur", baslangicZamani, 1);
		Kosucu kosucu6 = new Kosucu("Gizem", baslangicZamani, 1);
		Kosucu kosucu7 = new Kosucu("Aminenur", baslangicZamani, 1);

		List<Kosucu> kosucuListesi = new ArrayList<>(
				List.of(kosucu1, kosucu2, kosucu3, kosucu4, kosucu5, kosucu6, kosucu7));

		Thread thread1 = new Thread(kosucu1);
		Thread thread2 = new Thread(kosucu2);
		Thread thread3 = new Thread(kosucu3);
		Thread thread4 = new Thread(kosucu4);
		Thread thread5 = new Thread(kosucu5);
		Thread thread6 = new Thread(kosucu6);
		Thread thread7 = new Thread(kosucu7);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();

		try {
			thread1.join();
			thread2.join();
			thread3.join();

			thread5.join();
			thread6.join();
			thread7.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		kosucuListesi.stream().sorted(Comparator.comparingLong(x -> x.getSure())).forEach(System.out::println);
		;

	}

}