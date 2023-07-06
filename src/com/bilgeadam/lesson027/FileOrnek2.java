package com.bilgeadam.lesson027;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * okuma metodu yazalım donen degerleri yazdıralım 
 * 
 * 
 */
public class FileOrnek2 {

	List<Integer> icerik = new ArrayList<>();

	public static void main(String[] args) {

		FileOrnek2 fileOrnek2 = new FileOrnek2();
		fileOrnek2.dosyadanVeriOkuma("E:/java10-workspace/dosya/2.jpg");
		fileOrnek2.dosyayaVeriYazdırma("E:/java10-workspace/dosya/kopya.txt");
		fileOrnek2.dosyayaVeriYazdırma("E:/java10-workspace/dosya/kopya1.jpg");
		fileOrnek2.dosyayaVeriYazdırma("E:/java10-workspace/dosya/kopya2.jpg");
		fileOrnek2.dosyayaVeriYazdırma("E:/java10-workspace/dosya/kopya3.png");
		fileOrnek2.dosyayaVeriYazdırma("E:/java10-workspace/dosya/kopya4.png");
		fileOrnek2.dosyayaVeriYazdırma("E:/java10-workspace/dosya/kopya5.png");
		fileOrnek2.dosyayaVeriYazdırma("E:/java10-workspace/dosya/kopya6.png");
		fileOrnek2.dosyayaVeriYazdırma("E:/java10-workspace/dosya/kopya7.png");
		fileOrnek2.dosyayaVeriYazdırma("E:/java10-workspace/dosya/kopya8.png");

	}

	public void dosyadanVeriOkuma(String dosyaYolu) {
		try {
			FileInputStream fis = new FileInputStream(dosyaYolu);

			int deger;
			while ((deger = fis.read()) != -1) {
				System.out.print(deger + "-");
				icerik.add(deger);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void dosyayaVeriYazdırma(String dosyaYolu) {

		try {
			FileOutputStream fos = new FileOutputStream(dosyaYolu);

//			icerik.forEach(x -> {
//				try {
//					fos.write(x);
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			});

			for (Integer integer : icerik) {
				fos.write(integer);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}