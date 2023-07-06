package com.bilgeadam.lesson023;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateOrnek {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
	//	System.out.println(date.getDay());
	//	System.out.println(date.getDate());
	///	System.out.println(date.getYear());
		
		LocalDate date1 = LocalDate.now(); //GENELDE LOCALDATE ÜZERÜNDEN GİDECEĞİZ.
		LocalDateTime date2 = LocalDateTime.now();
		System.out.println(date1);
		System.out.println(date2);
		LocalDate date3 = LocalDate.of(2001, 06, 10);// herhangi bir zaman dilimindeki gün oluşturma
		LocalDate date4 = LocalDate.of(2001, Month.JUNE, 10);
		System.out.println(date3);
		System.out.println(date4);
		System.out.println(date3.getDayOfMonth());
		System.out.println(date3.getYear());
		System.out.println(date3.getDayOfYear()); // YILDAKİ KAÇINÇI GÜN OLDUGUNU GETİRİYOR
		System.out.println(date3.getDayOfWeek()); // GUNUN DEGERİNİ VERİR
		System.out.println(date3.getDayOfWeek().getValue()); // HAFTANIN KAÇINCI GÜNÜ.
		System.out.println(date3.isLeapYear()); // artık yıl mı ? true false her 4 yılda bir. Yılın 4e tam bolunmesi lazım.
		System.out.println(date3.plusYears(2));
		System.out.println(date3.plusMonths(2));
		System.out.println(date3.plusWeeks(2));
		System.out.println(date3.plusDays(2));
		System.out.println(date3.minusYears(2));
		System.out.println(date3.minusMonths(2));
		System.out.println(date1.isBefore(date3));
		System.out.println(date1.isAfter(date3));
		System.out.println(date3.isAfter(date1));
		System.out.println(date3.isEqual(date1));
		
		LocalDate date5 = LocalDate.parse("2022-12-15"); // yıl-ay-gun stringi çevirdik.
		System.out.println(date5.getDayOfYear());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy"); //
		String date6 = LocalDate.now().format(formatter);
		System.out.println(date6);
		
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy H:mm"); // Dışarıdan aldığımız  bu formattı şuanki localdate'e parse etti. 
		LocalDateTime date7 =LocalDateTime.parse("15/05/2022 15:16", formatter2);
		System.out.println(date7);
		
		LocalDate date8 = LocalDate.now();
		LocalDate date9 = LocalDate.parse("2022-06-05");
		long ay = date9.until(date8, ChronoUnit.MONTHS);
		System.out.println("ay==>" + ay);
		long gun = date9.until(date8, ChronoUnit.DAYS);
		System.out.println("gun==> " + gun);
		long gun2 = date8.until(date9, ChronoUnit.DAYS);
		System.out.println("gun==> " + gun2);
		long yıl = date9.until(date8, ChronoUnit.YEARS);
		System.out.println("yıl==> " + yıl);
		long hafta = date9.until(date8, ChronoUnit.WEEKS);
		System.out.println("hafta==> " + hafta);
		long yıl2 = ChronoUnit.YEARS.between(date9, date8);
		System.out.println(yıl2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
