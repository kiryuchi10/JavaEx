package com.javaex.exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArthimeticEcxceptionEx {
	
	//정수 1개 잊력
	//100을 입력받은 정수로 나눔
	//나눗셈 결과를 화면에 출력
	
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		double result=0;
		int num;
		System.out.println("정수 입력");
	
		try {// 예외 발생 가능 영역을 try 블록으로 감싼다
			num=a.nextInt();
			result=100/num;
		}	
		catch(InputMismatchException e){
			//입력형식에러
			System.err.println("정수를 입력하세요");
		}
		catch (ArithmeticException e) {
		 	System.err.println("0으로는 나눌 수 없습니다.");
		}catch (Exception e) {// 예외(정보) 클래스로 catch
			e.printStackTrace();//예외 스택 출력
		}finally {
			//예외 유무 관계 없이 가장 마지막에 1회 실행
			//try 블록에서 설정된 시스템 자원 등을 해제.
			//필수가 아니다 
			System.out.println("예외처리 종료");
		}
		
		System.out.println(result);
		
		a.close();
	}
}
