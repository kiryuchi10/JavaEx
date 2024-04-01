package com.javaex.exception;

public class NullPointExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= new String("hello");
		str=null;
		try {
			System.out.println(str.toString());
		}catch(NullPointerException e) {
			System.err.println("null 입니다");
		}
		
	}

}
