package com.bilgeadam.lesson019.stack;

import java.util.Stack;

/*
 * Lifo--> son giren ilk çıkar
 * 
 * 
 * İnteger bir stack olustrup içine 6 7 tane deger ekleyelim
 * 100den kucuk olan degerlein toplamını bulalım 
 * 100 den buyuk olanları da başka bir stack yapısna aktaralım
 * daha sonra yeni stacğimizi yazdıralım 
 * 
 * 
 * 
 */

public class StackOrnek {

	public static void main(String[] args) {
		Stack<Integer> firstStack = new Stack<>();
		Stack<Integer> lastStack = new Stack<>();

		firstStack.push(120);

		int sayi = firstStack.push(320);
		System.out.println("sayi" + sayi);
		firstStack.push(20);
		firstStack.push(50);
		firstStack.push(350);
		firstStack.push(5);
		firstStack.push(45);
		firstStack.push(450);
		firstStack.add(190);

		int toplam = 0;

//		while (!firstStack.isEmpty()) {
//			int deger = firstStack.peek();//  en üstteki veriye sadece bakar (STACK'İN EN USTUNDEKİ DEGERE BAKABİLMEMİZİ SAĞLAR) SEÇER
//			if (deger < 100) {
//				toplam += firstStack.pop(); // en usteki veriyi çıkartır
//			} else {
//				lastStack.push(firstStack.pop());
//			}
//		}

		while (!firstStack.isEmpty()) {
			int deger = firstStack.pop();
			if (deger < 100) {
				toplam += deger; // en usteki veriyi çıkartır
			} else {
				lastStack.push(deger);
			}
		}

		System.out.println("toplam" + toplam);

		for (Integer integer : lastStack) {   //FOR EACH'TE BİR ARRAY GİBİ YAZDIRDI. BUNU İSTEMİYORUZ.
			System.out.println(integer);

		}
		System.out.println("while dongusu");
		while (!lastStack.isEmpty()) {
			System.out.println(lastStack.pop());
		}

		System.out.println(lastStack.size());

	}

}

