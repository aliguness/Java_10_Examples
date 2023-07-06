package com.bilgeadam.lesson028;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {

		File file = new File(FileSabitler.OGRENCI_LIST_FILE_COPY);
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		File file2 = new File("E:/java10-workspace/dosya3/yeni.txt");

//		try {
//			System.out.println(file2.createNewFile());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// System.out.println(file2.delete());
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getFreeSpace());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getTotalSpace());
		System.out.println(file.getParent());
		System.out.println(file2.isDirectory());
		System.out.println(file.lastModified());
		System.out.println(file.length());
		System.out.println(file2.mkdirs());

	}
}