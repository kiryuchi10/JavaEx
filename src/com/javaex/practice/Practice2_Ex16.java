package com.javaex.practice;
import java.util.Scanner;

public class Practice2_Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		int num1;
		System.out.println("숫자: ");
		num1=sc.nextInt();
		int operation=0;
		
		 if (num1 >0 ) {
			 operation=7*num1+2;
			 System.out.println("계산결과는 "+operation+ "입니다");
	        } 
		 else {
			 operation=num1^3-9*num1+2;
			 System.out.println("계산결과는 "+operation+ "입니다"); 
	        }
	        
		sc.close();
	}

}
