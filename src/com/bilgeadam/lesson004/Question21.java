package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question21 {
	public static void main(String[] args) {
		int mKod;
		int tKod;
		Scanner scanner = new Scanner(System.in);
		int telefonKodu = 10;
		int mailKodu = 20;
		System.out.println("Lütfen bir Telefon Kodu giriniz. ");
		 tKod = scanner.nextInt();
		
		System.out.println("Lütfen bir mail kodu giriniz");
		 mKod = scanner.nextInt();
		 
		 if(telefonKodu==tKod && mailKodu==mKod) {
			 System.out.println("Sisteme kayıt oldunuz.");
		 }else if(telefonKodu==tKod && mailKodu != mKod){
			 System.out.println("email hatalıdır");
		 }
		 else if (telefonKodu != tKod && mailKodu ==mKod) {
			 System.out.println("telefon kodu hatalıdır");
		 }else {
			 System.out.println("Telefon ve mail kodu hatalıdır");
		 }
			 
		 
	}

}

