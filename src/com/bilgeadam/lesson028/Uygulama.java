package com.bilgeadam.lesson028;

import java.io.File;

public class Uygulama {

	public static void main(String[] args) {
		OgrenciFileIslemler ogrenciFileIslemler = new OgrenciFileIslemler();
		// baslangıicListesiOlusturma(ogrenciFileIslemler); // sıfırlama metodu
		ogrenciFileIslemler.dosyadanVeriOkuma(FileSabitler.OGRENCI_LIST_FILE_COPY);
		listedenOgrenciSecme(ogrenciFileIslemler);
	}

	public static void baslangıicListesiOlusturma(OgrenciFileIslemler ogrenciFileIslemler) {
		ogrenciFileIslemler.dosyadanVeriOkuma(FileSabitler.OGRENCI_LIST_FILE);
		// ogrenciFileIslemler.ogrenciList.forEach(System.out::println);
		ogrenciFileIslemler.listeyiDosyayaYazdirma(FileSabitler.OGRENCI_LIST_FILE_COPY);
	}

	public static void listedenOgrenciSecme(OgrenciFileIslemler ogrenciFileIslemler) {
		if (ogrenciFileIslemler.ogrenciList.isEmpty()) {
			System.out.println("Secilecek ogrenci kalmadı");
			baslangıicListesiOlusturma(ogrenciFileIslemler);
			File file = new File(FileSabitler.ALINAN_OGRENCI);
			file.delete();
		} else {
			int index = ogrenciFileIslemler.ogrenciSec();
			ogrenciFileIslemler.secilenOgrenciyiDosyayaYazdir(FileSabitler.ALINAN_OGRENCI, index);
			ogrenciFileIslemler.ogrenciList.remove(index);
			ogrenciFileIslemler.listeyiDosyayaYazdirma(FileSabitler.OGRENCI_LIST_FILE_COPY);
		}
	}

}