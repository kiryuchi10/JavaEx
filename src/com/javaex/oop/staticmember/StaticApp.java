package com.javaex.oop.staticmember;

public class StaticApp {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		StaticEx s1 = new StaticEx();
		System.out.println("refcount:"
				+s1.refCount);
		StaticEx s2 = new StaticEx();
		System.out.println("refcount:"
				+StaticEx.refCount);
		StaticEx s3 = new StaticEx();
		System.out.println("refcount:"
				+StaticEx.refCount);
		s3=null;//참조해제
		System.out.println("참조해제");
		System.out.println("refcount:"
				+StaticEx.refCount);
		
		System.gc();//가비지 컬렉터 호출
		try{
			Thread.sleep(3000);
			System.out.println("refCount: "+
			StaticEx.refCount);
		}catch(Exception e) {
			
		}
	}

}
