package com.bilgeadam.lesson006;

import java.util.Scanner;

/*
 * 
 * uzunlugu 5 olan bir int dizisi tanımlayıp 
 * dısarıdan aldıgımız degerleri bu diziye atayalım 
 * ve daha sonra bu dizinin elamnlarını yazdıralım 
 * 
 * 
 */
public class Question39 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] myArray = new int[5];

		for (int i = 0; i < myArray.length; i++) {
			System.out.println("lütfen " + (i + 1) + ". sayıyı giriniz");
			myArray[i] = scanner.nextInt();
		}

		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}

	}
}