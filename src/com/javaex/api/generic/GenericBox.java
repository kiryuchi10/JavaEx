package com.javaex.api.generic;
// T: Type,K : key ,V :value,R :Return 
// Generic
// 설계시 - 내부 데이터 타입을 미정 상태로 남겨두고
// 실제 객체화시 - 외부에서 내부 데이터타입을 결정해주는 방식
public class GenericBox<T> {
	T content;
	public T getContent() {
		return content;
	}
	public void setContent(T content) {
		this.content=content;
	}
}
