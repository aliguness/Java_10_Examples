package com.bilgeadam.lesson010;

/*
 * 
 * Çarpım tablosunu bir çift boyutlu arrayin içine toplyacağız
 * 1 ile 10 (10 da dahil) arasındaki sayılar için geçerli 
 * 1x1=1
 * 1x2=2;
 * .
 * 1x10=10
 * 
 * 2x1=1;
 * 2x2=2
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Question50 {

	public static void main(String[] args) {

//		String[][] array = carpimTablosuOlustur();
//		carpimTablosuYazdir(array);

		carpimTablosuYazdir(carpimTablosuOlustur());

	}

	public static String[][] carpimTablosuOlustur() {

		String[][] carpimTablosu = new String[10][10];

		// System.out.println(carpimTablosu.length);

//		String[][] array3 = new String[2][3];
//		String[][] array2 = { 
//				{ "1x1=1", "1x2=2", "1x3=3" },
//				
//				{ "2x1=2", "2x2=4", "2x3=6" } };// 2 e 3 bir array

//		    carpimTablosu[0][0]=
//				carpimTablosu[0][1]=
//				carpimTablosu[0][2]=
//				carpimTablosu[0][9]=
//						carpimTablosu[1][0]=	
//						carpimTablosu[1][1]=	
//						carpimTablosu[1][2]=	
//						carpimTablosu[1][9]=	
		for (int i = 0; i < carpimTablosu.length; i++) {

			for (int j = 0; j < carpimTablosu[i].length; j++) {
				carpimTablosu[i][j] = (i + 1) + "X" + (j + 1) + "=" + ((i + 1) * (j + 1));
			}

		}

		return carpimTablosu;

	}

	public static void carpimTablosuYazdir(String[][] dizi) {

		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				System.out.println(dizi[i][j]);
			}
		}

	}

}