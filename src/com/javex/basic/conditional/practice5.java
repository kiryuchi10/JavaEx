package com.javex.basic.conditional;
import java.util.Scanner;

public class practice5 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score;
		score=scanner.nextInt();
		if (score>90){
			System.out.println("A의 등급");
		}
		else if(89<=score&score<90){
			System.out.println("B의 등급");
	}
		else if(70<=score&score<80){
			System.out.println("C의 등급");
	}
		else if(60<=score&score<70){
			System.out.println("D의 등급");
	}
		else {
			System.out.println("F의 등급");
		}
		scanner.close();
	}
}