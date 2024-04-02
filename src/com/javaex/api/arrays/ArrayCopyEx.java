package com.javaex.api.arrays;

import java.util.Arrays;

public class ArrayCopyEx {
	public static void main (String[] args) {
		char[] src="Java Programming".toCharArray();
		System.out.println(src);
		System.out.println(Arrays.toString(src));
		char target[]=new char[src.length];
		System.arraycopy(src//원본 배열
				, 0 //복사 시작 인덱스
				, target// 타겟배열
				, 0 //타겟 배열의 복사 시작 인덱스
				, src.length //복사할 길이
				);
		System.out.println(target);
		System.out.println(Arrays.toString(target));
		
		// Arrays.copyOf를 이용한 copy 
		target=Arrays.copyOf(src, src.length);
		System.out.println(Arrays.toString(target));
		
		//Arrays.copyRangeof : 범위 복제
		target=Arrays.copyOfRange(src,
				5,//복사 시작 인덱스
				12//복사 끝 인덱스  
				);
		System.out.println(Arrays.toString(target));
	}
}
