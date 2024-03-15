package com.javex.basic.conditional;
import java.util.Scanner;
public class practice4 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score;
		score=scanner.nextInt();
		if (score%3==0){
			System.out.println("3의 배수");
		}
		else {
			System.out.println("3의 배수 아님");
	}
		scanner.close();
}
	
}