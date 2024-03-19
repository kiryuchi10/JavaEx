package com.javaex.practice;
import java.util.Scanner;

public class Practice2_Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요: ");
		int year;
		year=sc.nextInt();
		System.out.print("년도:" );
		int current;
		current=sc.nextInt();
		System.out.print("올해:" );
		int age=0;
		age=current-year;
		System.out.println("나이:"+age);
		if(year%2==0 & current%2==0) {
			if(age<20) {
				System.out.println("20살 미만 건강검진 대상아님");
			}
			else if(age>=20 & age<40)
			{
				System.out.println("20살이상\n건강검진해\n암 검사X");
			}
			else if(age>=20 & age<=40)
			{
				System.out.println("20살이상\n건강검진해\n암 검사O");
			}
		}
		else if(year%2!=0 & current%2!=0) {
			if(age<20) {
				System.out.println("20살 미만 건강검진 대상아님");
			}
			else if(age>=20 & age<40)
			{
				System.out.println("20살이상\n건강검진해\n암 검사X");
			}
			else if(age>=40)
			{
				System.out.println("20살이상\n건강검진해\n암 검사O");
			}
		else
		{
			if(age<20) {
				System.out.println("20살 미만 건강검진 대상아님");
			}
			else if(age>=20) {
				System.out.println("20살 이상 건강검진 대상아님");
			}
				
		}
		}
	}

}
