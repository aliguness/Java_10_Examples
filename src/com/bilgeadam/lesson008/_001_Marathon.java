package com.bilgeadam.lesson008;

public class _001_Marathon {
	public static void main(String[] args) {
	// for (int i = 20; i < 40; i++) System.out.println(i);
		
		int a = 7;
		String [] array = new String[a];

		for (int i = 0; i < array.length; i++) {
	        array[i] = String.valueOf(i + 5); 
	    }
		System.out.println(array);
		

		int value=4;

		switch (value) {
		case 1:
			System.out.print("Pazartesi");
			break;
		case 2:
			System.out.print("Salı");
			break;
		case 3:
			System.out.print("Çarşamba");
			break;
		case 4:
			System.out.print("Perşembe");

		case 5:
			System.out.print("Cuma");
			break;
		case 6:
			System.out.print("Cumartesi");
			break;
		case 7:
			System.out.print("Pazar");
			break;
		default:
			System.out.print("Hatalı Değer Girdiniz");
			break;
		}
		

String ifade ="bugün hava güneşli";
int sayi;
sayi=1;
ifade=sayi+ifade;
System.out.println(ifade);

System.out.println(" Abc 1".trim());

		
	}
}
