package com.javex.basic.conditional;
import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("과목 번호를 입력하세요.");
		int sub;
		sub=scanner.nextInt();
		
		
		switch(sub){
			case 1:
				System.out.println("R101");
				break;
			case 2:
				System.out.println("R202");
				break;
			case 3:
				System.out.println("R303");
				break;
			case 4:
				System.out.println("R404");
				break;
			default:
				System.out.println("관리자와 문의하세요");
		}
		scanner.close();
	}
}

