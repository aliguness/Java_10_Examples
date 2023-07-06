package com.bilgeadam.lesson011;

/*
 * türkçe karakterleri ingizlice karakterlere çevirme
 */

public class Questions53 {	
	
	public static void main(String[] args) {
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "ğ", "ü", "Ü", "ö", "Ö" };
	
	String[] ingilizceKarakter = { "ı", "i", "s", "S", "c", "C","g","G","u","U","o","O" };
	
	trToEng(turkceKarakter, ingilizceKarakter, "şeker");
	}

	private static void trToEng(String[] turkceKarakter, String[] ingilizceKarakter, String ifade) {
		
for (int i = 0; i < ingilizceKarakter.length; i++) {
	ifade = ifade.replace(turkceKarakter[i], ingilizceKarakter[i]);

}
	System.out.println(ifade);

	}

}
