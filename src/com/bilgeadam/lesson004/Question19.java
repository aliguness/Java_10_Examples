package com.bilgeadam.lesson004;
/*
 * 
 *  Soru4-)
 *  
 *  1 den 100 e kadar olan çift sayıların toplamının
 *  tek sayıların toplamına oranı
 *  
 */
public class Question19 {
	public static void main(String[] args) {
		
		double toplamTek=0;
		double toplamCift=0;
		for (int i = 0; i <= 100; i++) {
			if(i%2==0) {
				toplamCift+=i;
			}else {
				toplamTek+=i;
			}
		}
		System.out.println("çiftlerin toplamı: " + toplamCift);
		System.out.println("teklerin toplamı: " + toplamTek);
		System.out.println("oran: " + toplamCift / toplamTek);
	}

}
