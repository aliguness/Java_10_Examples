package com.bilgeadam.lesson004;
// soru2-) a dan z ye kadar alfabeyi yazdıralım ( dongu kullanarak)

public class Question17 {
	public static void main(String[] args) {
		
		char c;
		for ( c = 'a'; c <= 'z'; c++) {
			System.out.print(c + " ");

		}
		System.out.println();
	
		// 2. şekil çözümü
	char karakter = 97; // 97-122
	
	while(karakter>=97 && karakter <=122) {
		
		System.out.print(karakter + " ");
		karakter++;
	}
	
	for(char i=97; i<=127; i++) {
		System.out.print(i + " ");
	}

}}
