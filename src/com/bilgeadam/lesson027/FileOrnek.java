package com.bilgeadam.lesson027;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 * output-->yazma işlemi
 * input--> okuma işlemleri 
 * 
 */
public class FileOrnek {

	public static void main(String[] args) {

		File file = new File("E:/java10-workspace/dosya/deneme2.txt");

//		try {
//			file.createNewFile();
//			System.out.println(file.getName() + " olusturuldu");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {

//			FileWriter fileWriter = new FileWriter("E:/java10-workspace/dosya/deneme.txt");
//			FileReader fileReader = new FileReader("E:/java10-workspace/dosya/deneme.txt");
			// ======YAZMA İŞLEMİ======
			fos = new FileOutputStream("E:/java10-workspace/dosya/deneme.txt", true);// true degeri
			// program her
			// çalıştıgında
			// dosyayı
			// sıfırlamaz
			// var olan
			// veriyi korur
			// ve devamına
			// yazma işlemi
			// devam eder
			// FileOutputStream fos2 = new FileOutputStream(file);

//			fos.write(66); // karakter olarak yazdırır
//			fos.write(69);
			// byte[] array = { 101, 80, 85, 66 };
//			fos.write(array);
			// String kelime = "java";
			// fos.write(kelime.getBytes());

			// fos.write(50);
			// ===== OKUMA İŞLEMİ======
			fis = new FileInputStream("E:/java10-workspace/dosya/deneme.txt");
			// uzun yontem
//			int deger = fis.read();
//			System.out.println((char) deger);
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println(fis.read());

			int deger;

			while ((deger = fis.read()) != -1) {
				System.out.print((char) deger);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}