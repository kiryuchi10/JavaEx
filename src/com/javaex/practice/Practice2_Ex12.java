package com.javaex.practice;
import java.util.Scanner;

public class Practice2_Ex12 {

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
		int num3;
		System.out.println("숫자3: ");
		num3=sc.nextInt();
		int smallest;
		 if (num1 <= num2 && num1 <= num3) {
	            smallest = num1;
	        } else if (num2 <= num1 && num2 <= num3) {
	            smallest = num2;
	        } else {
	            smallest = num3;
	        }
	        
	        System.out.println("The smallest number is: " + smallest);
		
		
		sc.close();
	}

}
