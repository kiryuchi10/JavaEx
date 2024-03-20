package com.javex.basic.conditional;
import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.print("숫자를 입력하세요");
	int num;
	num=scanner.nextInt();
	if(num>0) {
		if (num%2==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
	}
	else if(num <0)
	 {
		 System.out.println("음수");
	 }
	 else {
		 System.out.println("0");
	 }
	
	scanner.close();
}
}
