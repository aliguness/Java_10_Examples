package com.bilgeadam.lesson008;

public class _001_Marathon_Soru3 {
	public static void main(String[] args) {
		
		System.out.println(karakterSayici("Bugün sınav zordu", 'u'));
		System.out.println(karakterSayici("Bugün sınav zordu", 'ğ'));
		
		
	}
	
	public static int karakterSayici(String str, char a) {
		int sayac = 0;
		for (int i =0; i < str.length(); i++) {
			
			if(str.charAt(i)== a ) {
				sayac++;
			}
		}
		return sayac;
	}

}
