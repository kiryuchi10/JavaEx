package com.javaex.collection.list;
import java.util.Enumeration;
import java.util.Vector;


public class VectorEx {

	public static void main(String[] args) {
		// 벡터 선언
		Vector v = new Vector(); //기본 벡터 버퍼 용량 10 
		System.out.println("size :" +v.size()+",Capacity"+v.capacity());
		
		for(int i=0;i<10;i++) {
			// 요소 추가
			v.addElement(i); //참조데이터... auto boxing
		}
		System.out.println("size :" +v.size()+",Capacity"+v.capacity());
		
		v.addElement(10);
		System.out.println("size :" +v.size()+",Capacity"+v.capacity());
		
		Integer val=(Integer)v.elementAt(5);// elementAt -> Object 리턴
		System.out.println(".elementAt(5) :" +val);
		
		//역참조(검색)
		//객체의 인덱스 조회
		System.out.println(".indexOf(5)"+v.indexOf(5));
		System.out.println(".indexOf(20):" +v.indexOf(20));//없는 객체 값일 시 -1이다. 
		

		System.out.println(".cotains(5)"+v.contains(5));
		System.out.println(".contains(20):" +v.contains(20));//없는 객체 값일 시 -1이다. 
		
		// 삭제 : .removeElement
		v.removeElement(7);
		
		for(int i=0;i<10;i++) {
			Integer item=(Integer)v.elementAt(i);
			System.out.println(item);
		}
		System.out.println();
		System.out.println("size :" +v.size()+",Capacity"+v.capacity());
		Vector<?super Number> v2= new Vector<>();
		v2.addElement(Integer.valueOf(2024));
		v2.addElement(Float.valueOf(3.1415f));
		//v2.addElement(String.valueOf("vector")); //string은 number를 상속 받지 않는 객체 
		
		// TODO : 개선된 방식으로 루프돌리기 
		//Eunmeration
		
		//Enumeration e=v.elements();
		Enumeration<?super Number> e2= v2.elements();
		while(e2.hasMoreElements()){
			// 뒤쪽에 더 요소가 있는가
			Integer item =(Integer)e2.nextElement();
			System.out.print(item+" ");
		}
		System.out.println();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Vecot<Integer>v2= new Vector<;\>
	
}
