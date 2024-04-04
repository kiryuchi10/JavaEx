package com.javaex.api.generic;

public class BoxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBox strBox= new StringBox();
		strBox.setContent("Generic");	
		
		String retStr = strBox.getContent();
		System.out.println(retStr);
		
		IntBox intBox = new IntBox();
		intBox.setContent(123);
		
		Integer retInt = intBox.getContent();
		System.out.println(retInt);
		
		//타입별로 처리할 수 있는 모든 객체를 만들어야 한다. 
		//->Object를 처리할 수 있는 개체를 만들면 모든 객체를 처리할 수 있은 만능 클래스가 된다. 
		ObjectBox objBox= new ObjectBox();
		objBox.setContent("Object Box");
		
		String obj= (String)objBox.getContent();// 캐스팅의 불편함. 
		System.out.println(obj);
		
		objBox.setContent(2024);
		Integer objInt=(Integer)objBox.getContent();
		//
		System.out.println(objInt);// 캐스팅의 불편함. 
		// 문제점 
		//	1.setter에서 전달되는 매개변수의 타입을 제한 할 수 없다.
		//	2.데이터를 받아올때 casting이 필요하다.  object를 실제 클래스로 변환 
		
		//String obj2= (String)objBox.getContent();// 캐스팅의 불편함.
		
		// GenericBox
		// 내부 데이터 타입을 외부에서 객체화 시점에서 결정
		GenericBox<String> genericStrBox = new GenericBox<>();//<String> 생략가능
		//-> 내부 데이터를 String타입을 결정
		genericStrBox.setContent("Generic Box");
		//genericStrBox.setContent(2024); //컴파일러가 체크가능하다. 
		String objStr=genericStrBox.getContent();
		//내부 저장 데이터가 지정 되어 있기 때문에 캐스팅 불필요 
		System.out.println(objStr);
	}

}
