package com.javaex.practice;
import java.util.Scanner;

public class Practice2_Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("사번(정수)를 입력해주세요");
		int num1;
		System.out.println("사번: ");
		num1=sc.nextInt();
		
		
		 if (num1 >0 ) {
	         if (num1%3==0) {
	             System.out.println("A팀입니다");
	            }
	         else if (num1%3==1) {
	        	 System.out.println("B팀입니다");
	         }
	         else if (num1%3==2) {
	        	 System.out.println("C팀입니다");
	         }
	        } 
		 	 else {
			 System.out.println("잘못입력하셧습니다 "); 
	        }
	        
		sc.close();
	}

}
