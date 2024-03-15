package com.javaex.basic.types;

public class VarEx {
	public static void main(String[] args){
		int myAge;
		myAge=25;
		System.out.println(myAge);
		//myAge='쉰둘'
	    //데이터 타입은 변경이 될 수 없다. 
		int myAge2=52;//선언과 동시에 초기화
		//여러 변수를 한번에 선언할 때 
		int v1=10,v2=20,v3=30;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		v1=v2=v3=40;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}
}
