package com.javex.basic.conditional;
import java.util.Scanner;

public class practice3 {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("과목을 선택하세요\n(1.자바, 2.C, 3. C++, 4.파이썬)");
	int code;
	code=scanner.nextInt();
	if (code==1) {
		System.out.println("R101");
	}
	else if(code==2) {
		System.out.println("R202");
	}
	else if(code==3) {
		System.out.println("R303");
	}
	else if(code==4) {
		System.out.println("R404");
	}
	else {
		System.out.println("나머지는\"상담원에게 문의하세요\"");
	}
	}
}
