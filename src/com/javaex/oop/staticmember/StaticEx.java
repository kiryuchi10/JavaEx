package com.javaex.oop.staticmember;

public class StaticEx {
	public static int refCount;
	public static String ClassVar;
	public String instanceVar;
	
	static {
		refCount=0;
		ClassVar="Static Member";
		//instanceVar="Instance Member";
		//인스턴스 변수로의 접근은 불과
		//static 영역에서는 static 영역만 접근  가능 
		System.out.println("클래스 영역 초기화");
	}
	public StaticEx() {
		refCount ++;
		System.out.println("refcount:"+refCount);
		System.out.println("Instance:"+ClassVar);
	}
	//소멸자
	protected void finalize() //throw NumberFormatException
	{
		refCount--;
		super.finalize();
		System.out.println("소멸자 호출");
	}
	
}
