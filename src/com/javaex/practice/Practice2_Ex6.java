package com.javaex.practice;
import java.util.Scanner;

public class Practice2_Ex6 {

	public static void main(String[] args) {
		//Ex6
		Scanner sc=new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
		int age;
		age=sc.nextInt();
		if(age>=19 & age<65) {
			System.out.println("1번 그룹입니다.");
		}
		else {
			System.out.println("2번 그룹입니다.");
		}
		sc.close();
	}

}
