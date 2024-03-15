package com.javaex.basic.types;

public class CastingEx {

	public static void main(String[] args) {
		// 암시적 캐스팅 (Promotion)
		promotionEX();
		// 명시적 캐스팅 (Casting)
		castingEx();
	}
	public static void castingEx() {
		// 표현 범위가 넓은 자료형 -> 좁은 자료형으로의 변환
		// 데이터의 유실 위험 -> 반드시 강제 타입 변환이 필요
		double d=1234567.890;
		System.out.println(d);
		float f=(float)d;
		System.out.println(f);
		long l =(long)f;
		System.out.println(l);
		short s=(short)l;
		System.out.println(Integer.toBinaryString((int)l));
		System.out.println(s);
	}
	public static void promotionEX(){
		//표현 범위가 좁은 자료형-> 넓은 자료형으로의 변환
		//암묵적으로 자동으로 캐스팅을 수행
		//byte->short->int->long->float->double
		byte b=25;
		System.out.println(b);
		short s=b;
		System.out.println(s);
		int i=s;
		//System.out.println(i);
		//long s=i;
		System.out.println(i);
		float j=i;
		System.out.println(j);
		double k=j;
		System.out.println(k);
		char ch ='A';
		short s2= (short)ch;//unsigned int(2)->2 바이트 정수
		System.out.println(s2);
	}
}
