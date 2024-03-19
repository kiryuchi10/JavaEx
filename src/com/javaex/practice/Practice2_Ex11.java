package com.javaex.practice;
import java.util.Scanner;

public class Practice2_Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자 2개를 입력해주세요");
		int num1;
		System.out.println("숫자1: ");
		num1=sc.nextInt();
		System.out.println("숫자2: ");
		int num2;
		num2=sc.nextInt();
		int quotient;
		int remain;
		if (num1>num2) {
			quotient=num1/num2;
			remain=num1%num2;
		}
		else {
			quotient=num2/num1;
			remain=num2%num1;
		}
		
	        System.out.println("몫: " + quotient+"\n"+"나머지: "+remain);
		
		
		sc.close();
	}

}
