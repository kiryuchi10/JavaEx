package com.javaex.api.stringclass;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		// 	문자열 기본
		stringBasic();
		usefulMethods();

	}
	private static void stringBasic() {
		String s1="Java"; //리터럴
		String s2= new String("Java");//메모리에 직접 객체생성
		String s3= "Java";//리터럴
		
		//리터럴과 new 객체 생성이  다르게 작동
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		//리터럴의 경우, 데이터가 같으면 같은 객체로 취급
		char[]letter= {'J','a','v','a'};
		String s4=new String(letter);
		System.out.println(letter);
		String s5=String.valueOf(2024);// int->string 
		System.out.println(s5);
		
	}
	private static void usefulMethods() {
		String str="Java Programming OOP Programming";
		// 문자열 길이 확인 : .length()
		System.out.println(".length():"+str.length());
		System.out.println(".toUpperCase():"+str.toUpperCase());
		System.out.println("charAt: "+str.charAt(5)); //5번째 숫자.
		int index =0;
		index=str.indexOf("Programming"); //str내 Programming의 위치 인덱스
		System.out.println("index:"+index);
		index+="Programming".length();
		index=str.indexOf("Programming",index);
		System.out.println("index2:"+index);
		index+="Programming".length();
		index=str.indexOf("Programming",index); // 검색 시작 위치를 뒤로 이동 
		System.out.println("index3:"+index); //새로운 시작위치에서 검색
		index=str.lastIndexOf("Programming");
		System.out.println("lastIndexOf: "+index);
		System.out.println("substring"+str.substring(5));
		System.out.println("substring"+str.substring(5,22));
		
		System.out.println("replace:"+str.replace("Programming","Coding"));
		String str2="          Hello       ";
		String str3=",Java";
		String str4=str2.trim();
		System.out.println(str4+str3);
		System.out.println("원본"+str);
		//문자열 데이터는 불변(immutable)이다
		//여러 가지 메서드를 통해 변화가 발생 했더라도 원본은 유지된다. 
		String[]split=str.split(" ");
		System.out.println(Arrays.toString(split));
		
		for(String data:split){
			System.out.println("조각:"+data);
		}
		System.out.println("ABC".compareTo("ABD"));// 비교해서 같으면 1, 다르면 -1 반환
	}
	
}
