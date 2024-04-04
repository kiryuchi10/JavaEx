package com.javaex.api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		// Wrapper 클래스
		// 		-기본 타입을 포장하여 객체 형태로 저장하는 클래스 (포장 클래스)
		
		//생성
		Integer i=new Integer(10);//deprecated(버전이 바뀌면 해당 표현 방법이 사라질수 있다)
								//에러는 아님 
		//Character c = new Character("c");
		Float F=Float.valueOf(3.14159f);//이 방식을 사용하자
		Boolean b= Boolean.valueOf(true);
		//기본 타입에 대응한 WrapperClass가 있다
		
		// 문자열로 된 데이터를 기본 데이터 타입으로 포장
		Integer i2=Integer.valueOf("2024");
		System.out.println(i2);
		Double d2= Double.valueOf(3.14159);
		Boolean b2=Boolean.valueOf(false);
		// 주의: 전달되는 파라미터의 문자열의 형태가 해당하는 기본형의 형태와 동일
		
		Integer i3=10;
		int result=i3+2;
		System.out.println(result);
		
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.parseInt("10",16));//16진수 ->10진수 정수
		System.out.println(Integer.toBinaryString(28));
		
		System.out.println(i2.doubleValue());//형변환
		
		//포장된 값의 비교
		Integer i4=Integer.valueOf(2024);//참조 객체
		Integer i5=Integer.valueOf(2024);//
		
		System.out.println(i4==i5);//자동 언박싱이 안됨 
		System.out.println(i4.intValue()==i5.intValue());//형변환
	}

}
