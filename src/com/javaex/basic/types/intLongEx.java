package com.javaex.basic.types;

public class intLongEx {
	public static void main(String[] args){
		//int 형 변수 4 byte
		int intVar1;
		int intVar2;
		intVar1=2024;
		//intVar2=1234567890123; out of range 
		System.out.println(intVar1);
	    //System.out.println(intVar2); may have not been initialized 
		long longVar1;
		long longVar2;
		longVar1=2024;
		longVar2=1234567890123L; // long형 데이터 뒤에는 L 
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		long amount =1_000_000_000_000L;
		System.out.println(amount);
		
		//진법 표기
		// 2진수, 8진수, 16진수
		int bin, oct, hex;
		bin = 0b1100;
		oct = 072;
		hex = 0xFF;
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}
}
