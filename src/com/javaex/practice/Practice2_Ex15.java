package com.javaex.practice;
import java.util.Scanner;

public class Practice2_Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		String sign_of=sc.next();
		int num1;
		System.out.println("숫자1: ");
		num1=sc.nextInt();
		System.out.println("숫자2: ");
		int num2;
		num2=sc.nextInt();
		int operation=0;
		
		switch(sign_of){
			case "+":
				operation=num1+num2;
				System.out.println("결과는: "+operation);
				break;
			case "-":
				operation=num1-num2;
				System.out.println("결과는: "+operation);
				break;
			case "*":
				operation=num1*num2;
				System.out.println("결과는: "+operation);
				break;
			case "/":
				operation=num1/num2;
				System.out.println("결과는: "+operation);
				break;
			default:
				System.out.println("계산할 수 없는 기호입니다");
		}
	        
	        
		
		
		sc.close();
	}

}