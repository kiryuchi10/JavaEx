package com.javex.basic.conditional;
import java.util.Scanner;

public class IfElseEx {
	//Tip :Ctrl + space (자동 임포트)
	//     Ctrl + shift + o (organize Imports)
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//
		System.out.print("점수는? ");
		int score=scanner.nextInt();
		
		
		if(score>=60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		scanner.close();
	}
}