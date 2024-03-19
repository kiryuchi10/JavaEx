package com.javaex.practice;
import java.util.Scanner;

public class Practice2_Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("태어난 년도를 입력 받습니다");
		int year;
		year=sc.nextInt();
		int now_year=2023;
		int age=now_year-year;
		if (15<age & age<=65) {
			System.out.println(age+"살 무료예방접종 대상자가 아닙니다");
		}
		else {
			System.out.println(age+"살 무료예방접종 대상자가 입니다");
			}		
		sc.close();
	}

}
