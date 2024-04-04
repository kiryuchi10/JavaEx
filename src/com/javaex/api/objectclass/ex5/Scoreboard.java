package com.javaex.api.objectclass.ex5;

import java.util.Arrays;

public class Scoreboard implements Cloneable {
	private int scores[];
	// clone 메서드를 이용을 위해 Cloneable 인터페이스 구현
	// 생성자 : 클래스 이름과 같고, 반환하지 않는다
	// 깊은 복제 :
	// -참조 필드인 경우 
	public Scoreboard(int[] scores) {
		
		super();
		this.scores = scores;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 깊은 복제를 위해서 내부 참조 데이터를 복제 
		
		// 먼저 얕은 복제 시도 
		Scoreboard clone = (Scoreboard)super.clone();
		//return super.clone();
		// 내부 참조 객체를 복제 시도 (깊은 복제)
		clone.scores= Arrays.copyOf(scores,
				scores.length);
		return clone; // 만들어진 복제본을 반환
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}
	//복제본 생성 메서드 
	public Scoreboard getClone() {
		//새로운 인스턴스를 저장함 변수 선언 
		//1)Object clone=null;
		Scoreboard clone=null;
		try {
			clone=(Scoreboard)clone(); //clone() 리턴 타입이 object이다 그랙서 형변환 필요
			//1)clone=super.clone();
		}catch(CloneNotSupportedException e){
			// 예외 로그 출력
			e.printStackTrace();
		}
		//1) return (Scoreboard)clone;
		return clone;
		
	}
}
