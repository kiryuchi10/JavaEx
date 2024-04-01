package com.javaex.api.objectclass.ex5;

public class CloneTest {

	public static void main(String[] args) {
		Scoreboard s1= new Scoreboard(new int []{10,20,30,40} ) ;
		System.out.println("s1"+s1);
		
		// 복제본 생성
		Scoreboard s2=s1.getClone();
		System.out.println("s2"+s2);
		
		System.out.println("s1==S2?"+(s1==s2));
		
		s1.getScores()[0]=50;//내부 참조 필드의 값을 변경 
		System.out.println("s1"+s1);
		System.out.println("s1.scores==s2.scores?"
		+(s1.getScores()==s2.getScores()));
	}
}
