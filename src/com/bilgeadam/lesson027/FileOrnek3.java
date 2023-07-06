package com.bilgeadam.lesson027;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOrnek3 {

	public static void main(String[] args) {
		String path = "E:/java10-workspace/dosya/deneme3.txt";
		File file = new File(path);

		BufferedReader bufferedReader;
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter;
		try {
			// fileWriter = new FileWriter(path);
			fileWriter = new FileWriter(file);
			bufferedWriter = new BufferedWriter(fileWriter);
			// bufferedWriter = new BufferedWriter(new FileWriter(file));
			bufferedWriter.write("Deneme2");
			bufferedWriter.write("Deneme3");
			bufferedWriter.newLine();
			bufferedWriter.write("Deneme4\n");
			bufferedWriter.write("Deneme5");
			// bufferedWriter.append("xyz", 1, 2);// substring gibi indexler uzerinden
			// çalısır son indexi almaz
			bufferedWriter.write("xyz", 1, 2); // ilk indexden itibaraen kac deger yazdıracagımız soyluyoruz
			bufferedWriter.flush();
			bufferedWriter.write("Deneme6");

			//// Okuma İşelemi/////
			bufferedReader = new BufferedReader(new FileReader(file));
//			System.out.println((char) bufferedReader.read());
//			System.out.println(bufferedReader.readLine());
//			System.out.println(bufferedReader.readLine());
//			System.out.println(bufferedReader.readLine());
//			System.out.println(bufferedReader.readLine());
			// 1.yontem
//			for (int i = 0; i < file.length(); i++) {
//				System.out.print((char)bufferedReader.read());
//			}

			String deger = null;

			while ((deger = bufferedReader.readLine()) != null) {
				System.out.println(deger);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			try {
//				bufferedWriter.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}

	}

}

// /Users/gunes/java10-workspace/dosya/2.png   kendi dosya uzantım