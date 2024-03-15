package com.javaex.basic.types;

public class FloatDoubleEx {
	public static void main(String[] args) {
			//float(4byte)
			//double(8byte)
		float floatVar;
		double doubleVar;
		
			//정밀도 체크
			floatVar=0.1234578901234567890F; //cannot convert from double to float
			doubleVar=0.12345678901234567890;
			
			System.out.println("float:"+floatVar);
			System.out.println("double:"+doubleVar);//정확도 포기 
			
			// E 표기법 
			int intVar;
			intVar=300000000;
			floatVar=3E8F;
			doubleVar=3E-9;
			
			System.out.println("intVar:"+intVar);
			System.out.println("floatVar:"+floatVar);
			System.out.println("doubleVar:"+doubleVar);
			
			//부동 소수점 계산의 유의점
			//float, double형은 정밀도 포기, 표현 범위만 넓힌 데이터.
			System.out.println(0.1*3);
	}
}
