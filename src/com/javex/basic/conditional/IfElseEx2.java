package com.javex.basic.conditional;
import java.util.Scanner;

public class IfElseEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("값을 입력하세요 : ");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		/*
		if(num>0) {
			System.out.println("양수");
		}
	
		else if(num<0) {
			System.out.println("음수");
		}
		else {
			System.out.println("0");
		}
		*/
		if (num==0) {
			System.out.println("0");
		}
		else {
			if(num>0)
			{
				System.out.println("양수");
			}
			else {
				System.out.println("음수");
			}
		}
	}
}
