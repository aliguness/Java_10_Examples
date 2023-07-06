package com.bilgeadam.lesson002;

/*
 * Bir turk lirası değerimiz olsun bunun başlangıç miktarını belirleyelim
 * 
 * daha sonra bir dolar kuru üzerinden
 * dolar cinsinden değerini hesaplayalım
 */


public class Question4 {
	
	public static void main(String[] args) {
		
		int turkLirasi = 20;
		
		
		float dolarKuru=3.14f;
		double guncelDolarKuru = 19.42;
		
		System.out.println("Türk Lirası"+ turkLirasi/dolarKuru);
		System.out.println("Türk Lirası"+ turkLirasi/guncelDolarKuru);
		
		
		
		
	}

}
