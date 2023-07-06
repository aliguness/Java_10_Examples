package com.bilgeadam.lesson003;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

/*
 * 1 den girdiğimiz sayıya kadar olan sayıların
 *  toplamını ekrana yazdıran program
 */

public class Question10 {
	public static void main(String[] args) {
		
		int sayi;
		int toplam=0;
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Lütfen bir sayı giriniz!");
			 sayi = sc.nextInt();
			
			 for(int i=1; i<=sayi; i++) { toplam+=i;
			 }
			 System.out.println("toplam= "+toplam);
		
			int i =1;
			toplam=0;
		
			while(i<=sayi) {
				toplam+=i;
				i++;
				
				
			}
			
			System.out.println("while toplam= "+toplam);
		
	}

}
