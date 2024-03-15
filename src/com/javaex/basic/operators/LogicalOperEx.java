package com.javaex.basic.operators;

public class LogicalOperEx {
	public static void main (String[] args)
		{
		int a=7;
		int b=3;
		
		//비교연산자 : >=,<=,>,<,==,!=
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//논리연산자
		//논리곱 And : &&
		//논리합 Or :||
		//논리부정 Not : !
		int n1=7;
		int n2=3;
		int n3=5;
		
		// n3는 0 초과, 10미만의 값
		// 		조건 1: c >0
		//		조건 2: c <10
		//결과 조건 1 and 조건 2
		boolean r1 =n3>0;
		boolean r2 =n3<10;
		boolean result =r1 && r2;
		
		r1 = n3<=0;
		r2 = n3>=10;
		result =r1 || r2;
		
		//논리부정1 
		result =!(n3>0&&n3<10);
		//-> c<=0||c>=10) 논리결과 동일 
		System.out.println(result);
		//논리부정2
		result =!(n3<=0 || n3>=10);
		//->c>0&& c<10 논리결과 동일
		System.out.println(result);
				
		
	}
}
