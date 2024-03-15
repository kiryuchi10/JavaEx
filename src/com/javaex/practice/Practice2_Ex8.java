package com.javaex.practice;
import java.util.Scanner;

public class Practice2_Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.");
		
		int height;
		System.out.println("키: ");
		height=sc.nextInt();
		int weight;
		System.out.println("몸무게: ");
		weight=sc.nextInt();
		float BMI;
		BMI=(float)weight/height;
		if (BMI <18.5) {
			System.out.println("저체중");
		}
		else if(BMI>24.9) {
			System.out.println("고체중");
		}
		else {
			System.out.println("정상체중");
		}
		System.out.println("BMI: ");
		System.out.println(BMI);
		
		sc.close();
	}

}
