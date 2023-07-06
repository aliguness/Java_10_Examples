package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String boyut2 = scanner.nextLine();

		String boyut = "XL"; //S-M-L-XL pizza boyutlarımız
			
		
		switch (boyut2) {
		case "S":
			System.out.println("Küçük boy pizza seçtiniz");
			break;
		case "M":
			System.out.println("Orta boy pizza seçtiniz");
			break;
		case "L":
			System.out.println("Büyük boy pizza seçtiniz");
			break;
		case "XL":
			System.out.println("En büyük boy pizza seçtiniz");
			break;

		default:
			System.out.println("Yanlış bir seçim yaptınız Lütfen S/M/L/XL değerlerini giriniz");
			break;
		}
	}

}
