package com.bilgeadam.lesson004;

import java.util.Scanner;


public class QuestionOdev {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean kontrol = false;
	do {
		kontrol = false;
		System.out.println("Lütfen doğdugunuz ayın kaçıncı gunu oldugunu yazınız");
		int gun = scanner.nextInt();
		System.out.println("lütfen doğdugunuz ayın yılın kaçıncı ayı oldgunu giriniz");
		int ay = scanner.nextInt();
		
		switch (ay) {
		case 1:
			if (gun > 31 || gun < 1) {
				System.out.println("Ocak ayının son gunu 31 ocaktır ve il gunu 1 ocaktır lutfen bu aralık");
				kontrol = true;
				
			} else if (gun>31 || gun<1) {
				System.out.println("Bucunuz oğlak");
			}else {
				System.out.println("Burcunuz kova");
			}
			
			break;
		case 2:
			if (gun > 29 && gun < 1) {
				System.out.println("Şubat ayının son gunu 31 ocaktır ve il gunu 1 ocaktır lutfen bu aralık");
				kontrol = true;
				
			} else if (gun <= 19) {
				System.out.println("Bucunuz kova");
			}else {
				System.out.println("Burcunuz balık");
			}
			
			break;	
		case 3:
			if (gun > 31 || gun < 1) {
				System.out.println("Mart ayının son gunu 31 ocaktır ve il gunu 1 ocaktır lutfen bu aralık");
				kontrol = true;
				
			} else if ( gun <= 19) {
				System.out.println("Bucunuz Balık");
			}else {
				System.out.println("Burcunuz koç");
			}
			
			break;
		case 4:
			if (gun > 30  || gun < 1) {
				System.out.println("Nisan ayının son gunu 31 ocaktır ve il gunu 1 ocaktır lutfen bu aralık");
				kontrol = true;
				
			} else if ( gun <= 20) {
				System.out.println("Bucunuz koç");
			}else {
				System.out.println("Burcunuz boğa");
			}
			
			break;
		case 5:
			if (gun > 31 || gun < 1) {
				System.out.println("Mayıs ayının son gunu 31 ocaktır ve il gunu 1 ocaktır lutfen bu aralık");
				kontrol = true;
				
			} else if (gun <= 20) {
				System.out.println("Bucunuz boğa");
			}else {
				System.out.println("Burcunuz ikizler");
			}
			
			break;
		case 6:
			if (gun > 30 || gun < 1) {
				System.out.println("Haziran ayının son gunu 31 ocaktır ve il gunu 1 ocaktır lutfen bu aralık");
				kontrol = true;
				
			} else if ( gun <= 22) {
				System.out.println("Bucunuz ikizler");
			}else {
				System.out.println("Burcunuz yengeç");
			}
			
			break;
		case 7:
			if (gun > 31 || gun < 1) {
				System.out.println("Temmuz ayının son gunu 31 ocaktır ve il gunu 1 ocaktır lutfen bu aralık");
				kontrol = true;
				
			} else if ( gun <= 22) {
				System.out.println("Bucunuz yengeç");
			}else {
				System.out.println("Burcunuz aslan");
			}
			
			break;
		case 8:
			if (gun > 31 || gun < 1) {
				System.out.println("Ağustos ayının son gunu 31 ocaktır ve il gunu 1 ocaktır lutfen bu aralık");
				kontrol = true;
				
			} else if ( gun <= 22) {
				System.out.println("Bucunuz aslan");
			}else {
				System.out.println("Burcunuz başak");
			}
			
			break;
		case 9:
			if (gun > 30 || gun < 1) {
				System.out.println("Eylül ayının son gunu 31 ocaktır ve il gunu 1 ocaktır lutfen bu aralık");
				kontrol = true;
				
			} else if ( gun <= 22) {
				System.out.println("Bucunuz Başak");
			}else {
				System.out.println("Burcunuz Terazi");
			}
			
			break;
		case 10:
			if (gun > 31 || gun < 1) {
				System.out.println("Ekim ayının son gunu 31 ocaktır ve il gunu 1 ocaktır lutfen bu aralık");
				kontrol = true;
				
			} else if ( gun <= 22) {
				System.out.println("Bucunuz Terazi");
			}else {
				System.out.println("Burcunuz akrep");
			}
			
			break;
		case 11:
			if (gun > 30 || gun < 1) {
				System.out.println("Kasım ayının son gunu 31 ocaktır ve il gunu 1 ocaktır lutfen bu aralık");
				kontrol = true;
				
			} else if ( gun <= 21) {
				System.out.println("Bucunuz akrep");
			}else {
				System.out.println("Burcunuz yay");
			}
			
			break;
		case 12:
			if (gun > 31 || gun < 1) {
				System.out.println("Kasım ayının son gunu 31 ocaktır ve il gunu 1 ocaktır lutfen bu aralık");
				kontrol = true;
				
			} else if ( gun <= 21) {
				System.out.println("Bucunuz akrep");
			}else {
				System.out.println("Burcunuz yay");
			}
			
			break;


		default:
			System.out.println("Bir yılda 12 ay vardır lütfen 1 ile 12 arasında bir sayı giriniz");
			kontrol = true;
			break;
		}
	} while (kontrol);
	}
}
