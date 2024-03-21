package com.javaex.basic.reftype;
import java.util.Arrays;

public class ArrayCopyEx {
	//배열을 크기 변경 불가
	//공간을 늘리고자 하면 새 배열 생성후 복사
	public static void main(String[] args) {
		//For문 배열복사
		//arrayCopyByFor();
		//System을 이용한 배열 복사
		arrayCopyBySystem();
	}
	public static void arrayCopyByFor() {
		int scores[]= {1,2,3}; //length 3 
		for(int i =0;i<scores.length;i++) {
			System.out.print(scores[i]+"\t");
		}
		System.out.println();
		//새공간을 만들어 복사
		int target[]=new int[10];
		for(int i =0;i<scores.length;i++) {
			target[i] =scores[i];
		}
		System.out.println(Arrays.toString(target));
	}
	public static void arrayCopyBySystem() {
		int source[]= {1,2,3};
		int target[]=new int[10];
		
		System.out.println("source:"+Arrays.toString(source));
		System.arraycopy(source, //original array
				0, //복사시작의 인덱스
				target,//복사대상의 배열
				3, //대상배열의 시작 인덱스
				source.length);//대상배열의 시작 인덱스
		
		System.out.println("target:"+Arrays.toString(target));
		//enhanced for
		//for (추출된 데이터: 원본 배열 혹은 컬렉션)
		for(int val:target) {
			System.out.print(val+"\t");
		}
		System.out.println();
	}
}
