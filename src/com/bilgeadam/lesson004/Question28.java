package com.bilgeadam.lesson004;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Question28 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi = scanner.nextInt();
		
		while(true) {
			if(sayi%5==0) {
				sayi = sayi / 5;
			}else if (sayi == 1) {
				System.out.println("sayi 5 in kuvvetidir");
				break;
			}else {
				System.out.println("5in kuvveti değildir");
				break;
			}
		}
	}

}
