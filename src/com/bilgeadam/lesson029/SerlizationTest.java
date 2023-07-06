package com.bilgeadam.lesson029;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SerlizationTest {

	public static void main(String[] args) {

		Movie movie = new Movie("Seven", "Drama", LocalDate.of(1995, 05, 05));

		Movie movie3 = new Movie("Pulp Fiction", "Drama", LocalDate.of(1994, 05, 05));

		List<Movie> movieList = new ArrayList<>(List.of(movie, movie3));

		// serilizationList(movieList);
		// serilizationList2(movieList);
		// List<Movie> yeniListe = deserilizationList();
		List<Movie> yeniListe = deserilizationList2();

		if (yeniListe.isEmpty()) {

			System.out.println("Başarısız");
		} else {
			yeniListe.forEach(System.out::println);
		}

		// serilization(movie);
//		Optional<Movie> movie2 = deserilization();
//
//		if (movie2.isEmpty()) {
//			System.out.println("deserilize işlemi başarısız!!!");
//		} else {
//			System.out.println("deserilize işlemi başarılı");
//			System.out.println(movie2.get());
//		}

	}

	public static void serilizationList2(List<Movie> movieList) {
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("E:/java10-workspace/dosya/seri3.txt"))) {

			oos.writeObject(movieList);

			System.out.println("Serilize işlemi başarılı");
		} catch (Exception e) {
			System.out.println("Serilize işlemi başarısız");
			e.printStackTrace();
		}
	}

	public static void serilizationList(List<Movie> movieList) {

		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("E:/java10-workspace/dosya/seri2.txt"))) {
			for (Movie movie : movieList) {
				oos.writeObject(movie);
			}
			System.out.println("serlize işlemi başarılı");
		} catch (Exception e) {
			System.out.println("serlize işlemi başarısız!!!");
			e.printStackTrace();
		}

	}

	public static void serilization(Movie movie) {
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("E:/java10-workspace/dosya/seri.txt"))) {
			oos.writeObject(movie);
			System.out.println("Serilestirme işlemi başarılı");
		} catch (FileNotFoundException e) {
			System.out.println("Serilestirme işlemi başarısız!!!!!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Serilestirme işlemi başarısız!!!!");
			e.printStackTrace();
		}
	}

	public static List<Movie> deserilizationList() {
		List<Movie> movieList = new ArrayList<>();
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("E:/java10-workspace/dosya/seri2.txt"))) {

			Movie movie = null;
			while ((movie = (Movie) ois.readObject()) != null) {
				movieList.add(movie);
			}

		} catch (EOFException e) {
			System.out.println("Butun veriler okundu");
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return movieList;
	}

	public static List<Movie> deserilizationList2() {

		List<Movie> list = new ArrayList<>();
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("E:/java10-workspace/dosya/seri3.txt"))) {
			list = (List<Movie>) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static Optional<Movie> deserilization() {
		Movie movie = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/java10-workspace/dosya/seri.txt"))) {
			movie = (Movie) ois.readObject();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (FileNotFoundException e) {
			;
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return Optional.ofNullable(movie);
	}

}