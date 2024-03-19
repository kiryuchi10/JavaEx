package com.javaex.practice;
import java.util.Scanner;

public class P3_ex14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num;
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}

}
