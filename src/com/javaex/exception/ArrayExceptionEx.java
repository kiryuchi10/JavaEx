package com.javaex.exception;

public class ArrayExceptionEx {
	public static void main(String[] args) {
		int [] intArray=new int[] {3,6,9};
		//System.out.println(intArray[3]);
		
		try {
			System.out.println(intArray[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Array index out of bounds");
		}
		
	}
}
