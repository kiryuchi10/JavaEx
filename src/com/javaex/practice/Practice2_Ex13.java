package com.javaex.practice;

import java.util.Scanner;

public class Practice2_Ex13 {

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
		
		
		 if (num1 > num2 ) {
	         if (num1%num2==0) {
	             System.out.println(num2+"는(은) "+num1+" 의 약수입니다.");
	            }
	        } 
		 else {
			 if (num2%num1==0) {
				 System.out.println(num1+"는(은) "+num2+" 의 약수입니다.");
	            }
	        } 
	        
	        
		
		
		sc.close();
	}

}
