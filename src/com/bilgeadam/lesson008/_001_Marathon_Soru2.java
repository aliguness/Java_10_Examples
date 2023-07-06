package com.bilgeadam.lesson008;

public class _001_Marathon_Soru2 {
	public static void main(String[] args) {
		int[] array = {15, 3, 5,15, 7, 10, 15, 11, 13, 15, 56, 38,};
		sayiDizisi(array);
	
	}

	private static void sayiDizisi(int[] array) {
		
		int tekrarSayisi= 0;
		
		for (int i = 0; i < array.length; i++) {
			int sayac = 0;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i]== array[j]) {
					sayac++;
					
				}
				
			}
			if (sayac > 0) {
				tekrarSayisi = sayac + 1;
				System.out.println(array[i] + " sayısı " + (tekrarSayisi)+" kez tekrar ediyor");

				break;
			}
			
		}
		if (tekrarSayisi == 0) {
			System.out.println("tekrar eden sayı bulunamamıştır");

		}
		
	}

}
