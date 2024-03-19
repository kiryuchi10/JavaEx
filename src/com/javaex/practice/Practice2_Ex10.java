package com.javaex.practice;
import java.util.Scanner;

public class Practice2_Ex10 {

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
		
		if (num1>num2) {
			System.out.println("큰수: "+num1+"\t"+"작은수: "+num2);
		}
		else {
			System.out.println("큰수:"+num2+"\t"+"작은수: "+num1);
			}		
		sc.close();
	}

}
