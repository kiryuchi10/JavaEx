package com.javaex.practice;
import java.util.Scanner;

public class Practice2_Ex17 {

	public static void main(String[] args) {
		/*⚫ 세금계산법
		⚫ 0원이상 1000만원 이하인 경우 tax: 0.09*수익
		⚫ 1000만원 초과 4000만원 이하인 경우 tax: 1000*0.09 + 0.18*(수익-1000)
		⚫ 4000만원 초과 8000만원 미만인 경우 tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
		⚫ 8000만원 이상인 경우 tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)*/
		Scanner sc=new Scanner(System.in);
		System.out.println("수익을 입력해주세요.");
		double money;
		money=sc.nextInt();
		double revenue;
		revenue=0;
		if(money>=0 & money<=1000) {
			revenue=money*0.09;
			System.out.println("금익: "+money);
			System.out.println("소득세는 "+revenue);
		}
		else if(money>=4000 & money>8000){
			revenue=1000*0.09 + 3000*0.18 + 0.27*(money-4000);
			System.out.println("금익: "+money);
			System.out.println("소득세는 "+revenue);
		}
		else if(money<=4000 & money>8000){
			revenue=1000*0.09 + 3000*0.18 + 0.27*(money-4000);
			System.out.println("금익: "+money);
			System.out.println("소득세는 "+revenue);
		}
		else if(money>=8000){
			revenue=1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(money-8000);
			System.out.println("금익: "+money);
			System.out.println("소득세는 "+revenue);
		}
		else
		{
			System.out.println("잘못 입력했습니다.");
		}
		sc.close();
	}
	
}
