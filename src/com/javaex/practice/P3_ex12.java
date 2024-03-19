package com.javaex.practice;
import java.util.Scanner;

public class P3_ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int num;
		num=sc.nextInt();
		int factorial=1;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
		sc.close();
	}
}
