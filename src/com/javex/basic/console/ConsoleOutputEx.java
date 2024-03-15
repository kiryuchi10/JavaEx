package com.javex.basic.console;

public class ConsoleOutputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print 프린트 안함
		//System.out.println 프린트함
		//System.out.prinㅅㄹ :형식지정문자열출력
		System.out.print("Hello ");
		System.out.println("Java");
		
		String str1="Hello";
		String str2="Java";
		
		System.out.println(str1+" "+str2);
		
		//escape 문자 
		// \n, \t,\"(인용구호),\\(\)
		System.out.println("Hello \n Java");
		System.out.println("Hello \tJava");
		System.out.println("Hello,\"Java\"");
		//System.out.println("Hello \\ Java");
		String path="C:\\Users\\Hong\\memo.txt";
		System.out.println(path);
				
	}

}
