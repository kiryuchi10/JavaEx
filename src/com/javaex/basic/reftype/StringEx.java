package com.javaex.basic.reftype;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//선언 이후에 할당
		String str1; //null
		str1="Java"; //참조변수 만듬
		String str2="Java";//선언과 동시 할당
		String str3=new String("Java");
		//세 참조 변수는 같은 값을 가지고 있다
		//참조변수의 경우 ==은 메모리 주소의 비교
		System.out.println(str1==str2);//true  ,
		System.out.println(str2==str3);//false ,주소값이 다르다
		//값을 비교할려고 하자면 equals() 메서드 사용가능 
		System.out.println(str1.equals(str2));//true
		System.out.println(str2.equals(str3));//true
		
	}

}
