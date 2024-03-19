package com.javaex.practice;

public class Practice1 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			//EX1: byte
			//Ex2 : 1
			//Ex3 : 2
			//Ex4 : 1->3->2->4
			//Ex5 :  
			//		(1) 패키지명은 일반적으로 가독성을 위해 대문자, 소문자 섞어 사용한다.
			//		(2) 클래스명은 소문자로만 구성하여 작성한다
			//		(3) 자바 소스파일(~.java)명과 클래스 이름은 대소문자까지 모두 동일한 단어를 사용해야 한다.
			//		(4) 실행문 뒤(문자의 끝)에는 반드시 ( ; )세미콜론을 사용해야 한다.
			//		(5) 처음으로 실행되는 함수의 이름은 개발자가 임의로 작성해서 만든다
			//Ex6 :   (1) 변수한개에는 동시에 한 개의 값을 담을 수 있다.
					//(2) 변수는 선언시에 사용한 타입의 값외에도 저장할 수 있다.
					//(3) 변수는 초기값이 저장되어야 읽을 수 있다.
					//(4) 모든 자료형의 변수는 동일한 방식으로 저장된다.
					//(5) double형은 float보다 큰 수를 담을 수 있다.
					//(6) int, float, char, String은 모두 기본자료형에 속한다
					//(7) final로 선언된 변수는 수정이 불가능하다
					//(8) long형에는 항상 ‘L’을 붙여서 대입해야 한다.
					//(9) float형에는 항상 ‘F’을 붙여서 대입해야 한다.
			//Ex7 :
			/*
			int true;
			int _#_of_workers;
			int countOfLettersInString;
			int _1stLevel1;
			int person#;
			int _person;
			*/
		    //Ex8
			System.out.println("Hello World");
			//Ex9
			//	short (2) (정수형 )
			//	double(8) (실수형 )
			//	float (4) (실수형)
			//	byte (1) (정수형 )
			//	char (2) (문자형 )
			//	Boolean (1) (논리형)
			//	long (8) (정수형)
			//Ex10
			//1)Byte, 2)short, 3)2byte,4)4byte,5)long
			//6)float,7)double
			
			//Ex11
			int iVar=10;
			long lVar=1000000000000L;
			String cVar="ab";
			double dVar=10;
			double fVar=12.4;
			String str="ab";
			//Ex12
			int x,y=0;
			String grade="A";
			int salary=2_000_000;
			int n= 1000;
			//Ex13
			System.out.println(13/5);//실수형 값 반환
			System.out.println((double)13/5);
			System.out.println(13/(double)5);
			System.out.println((double)13/(double)5);
			System.out.println(13.0/5);
			System.out.println(13/5.0);
			System.out.println((double)(13/5));//실수형 값 반환 후 자료형변환
			//Ex14
			int a=5;
			System.out.println(a);
			System.out.println(++a);//6
			System.out.println(a);//6
			System.out.println(a++);//6
			System.out.println(a);//7
			System.out.println(--a);//6
			System.out.println(a);//6
			System.out.println(a--);//6
			System.out.println(a);//5
			//Ex15
			System.out.println(12/5-3);
			System.out.println(5+19%3);
			System.out.println(2+2/2);
			System.out.println(12/5-3);
			System.out.println(12/5-3);
			System.out.println(12/5-3);
			System.out.println(12/5-3);
			//Ex16
			int x =1;
			int y =1;
			
			int a = ++x*2;//4
			int b= y++*2;//2
			
			System.out.println("a="+a);//4
			System.out.println("b="+b);//2
			System.out.println("x="+x);//2
			System.out.println("y="+y);//2
			//Ex17
			int i,j;
			i=10;
			j=20;
			sum=i+j;
			System.out.println("합은 " + sum);
			
			//Ex18
			//Ex24
			//5/9는 실수형이다. 따라서 곱은 0*(f-32.0)임으로 0이다
			
	}
			

}

