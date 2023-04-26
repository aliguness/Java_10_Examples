package com.bilgeadam.lesson001;

public class Question1 {
	

	public static void main(String[] args) {
		
		
		//primitive(ilkel) veri Tipleri
		//
		
		/*
		 * değişken isimlerini adlandırmada camel Case kullanılır. ilk harf kuçuk daha sonra gelen yeni kelimenin ilk harfi büyük olacak.
		 */
		
		int sayi=5;
		byte myByte=25;
		short myShort=5222;
		long myLong=1_000_000_000;
		double myDouble=125000.52;
		boolean myBoolean=true;
		float myFloat=128.65f;
		char myChar='A';
		char myChar2=66;
		
		
		System.out.println("int deger==>  "+sayi);
		System.out.println("long deger==>  "+myLong);
		System.out.println("byte deger==>  "+myByte);
		System.out.println("short deger==>  "+myShort);
		System.out.println("double deger==>  "+myDouble);
		System.out.println("boolean deger==>  "+myBoolean);
		System.out.println("float deger==>  "+myFloat);
		System.out.println("char deger==>  "+myChar);
		System.out.println("char deger2==>  "+myChar2);
		System.out.println("int degerin char karşılığı ==>  "+ (char) sayi);
		System.out.println("iki char değerinin toplanması==> "+ (myChar+myChar2));
		
		//Wrapper Class (Sarmalayıcı Sınıflar) preference türler
		
		Integer myInteger=529;
		Integer myInteger2 = null;
		int myInt= 0;
		System.out.println("INTEGER ==>"+myInteger2);
		
		myInteger2=myInt;
		
		System.out.println("INTEGER ==>"+myInteger);
		System.out.println("INTEGER2 ==>"+myInteger2);
		System.out.println("int ==>"+myInt);
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.toString(myInt));  //Integer değeri stringe çevirir.
		
		
		System.out.println("Double Max==>"+Double.MAX_VALUE+" min==>"+Double.MIN_VALUE);
		System.out.println("Long Max==>"+Long.MAX_VALUE+" min==>"+Long.MIN_VALUE);
		System.out.println("Short Max==>"+Short.MAX_VALUE+" min==>"+Short.MIN_VALUE);
		System.out.println("Byte Max==>"+Byte.MAX_VALUE+" min==>"+Byte.MIN_VALUE);
		System.out.println("Float Max==>"+Float.MAX_VALUE+" min==>"+Float.MIN_VALUE);
		System.out.println("Integer Max==>"+Integer.MAX_VALUE+" min==>"+Integer.MIN_VALUE);
		System.out.println("/////////////");
		
		
		long number1=32767;
		long number2=100;
		byte number3= (byte)number2;
		byte number4= (byte)number1;
		System.out.println(number3);
		System.out.println(number4);
		
		long result=number1+number3;
		System.out.println(result);
		short number5=(short) (number1+number3);
		short number6=(short) (number2+number3);
		
		
		
		
		
		double number9=25.4;
		long result2= (long) (number9+number2);
		
		double result3= number9+number2;
		System.out.println(result2);
		System.out.println(result3);
		
		
		int number10=125/10;
		System.out.println(number10);
		
		float number11= (float) (number9+10);
		double number12= number11+10;
		System.out.println(number11);
		System.out.println(number12);
		
		String isim="Mustafa";
		
		
		
		
	}
	
	

}
