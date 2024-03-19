package com.javaex.practice;
import java.util.Scanner;

public class Practice2_Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("태어난 년도를 입력하세요");
		int year;
		year=sc.nextInt();
		int current;
		current=2023;
		int age=0;
		age=current-year;
		
		if(age<15 & age >=65) {
			System.out.println(age+"살 무료예방접종 대상자 입니다");
		}
		else if(age>=15 & age<65)
		{
			System.out.println(age+"살 무료예방접종 대상자가 아닙니다");
		}
		else
		{
			System.out.println("잘못 입력했습니다");
		}
	}

}
