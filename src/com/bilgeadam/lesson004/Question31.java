package com.bilgeadam.lesson004;

public class Question31 {
	public static void main(String[] args) {
		
	String kelime = "Javahahshdhahsdhahdhahz";
	char karakter = kelime.charAt(0);
	char karakter1 = kelime.charAt(1);
	char karakter2 = kelime.charAt(2);
	char karakter3 = kelime.charAt(3);
	int sonIndex = kelime.length() - 1;
	char sonKarakter = kelime.charAt(kelime.length() - 1);
	char sonKarakter2 = kelime.charAt(sonIndex);
	System.out.println(karakter);
	System.out.println(karakter1);
	System.out.println(karakter2);
	System.out.println(karakter3);
	System.out.println(sonKarakter);
	System.out.println(sonKarakter2);
	
	System.out.println(kelime.length());
	
	for (int i = 0; i < kelime.length(); i++) {
		System.out.println(i + ".indexteki karakter==>" + kelime.charAt(i));
		
	}
	
		
	}
	
	

}
