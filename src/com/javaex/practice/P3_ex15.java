package com.javaex.practice;
import java.util.Scanner;

public class P3_ex15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num;
		num=sc.nextInt();
		int sum;
		sum=0;
		int count;
		count=0;
		for(int i=1;i<=num;i++) {
			if(i%5==0) {
		        sum+=i;
		        count++;
			}
		}
		System.out.println("5의 배수의 갯수는 :"+count);
		System.out.println("5의 배수의 합계는 :"+sum);
		
		sc.close();
	}

}
