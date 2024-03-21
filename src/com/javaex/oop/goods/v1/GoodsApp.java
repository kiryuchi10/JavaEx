package com.javaex.oop.goods.v1;


public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera =new Goods();
		camera.name="nikon";
		camera.price=400000;
		//상품 정보 출력
				System.out.printf("%s,%d원%n", 
						camera.name,camera.price);
		Goods notebook=new Goods();
		notebook.name="LG그램";
		notebook.price=900000;
		//상품 정보 출력
				System.out.printf("%s,%d원%n", 
						notebook.name,notebook.price);
		Goods mug=new Goods();
		mug.name="머그컵";
		mug.price=2000;
		//상품 정보 출력
				System.out.printf("%s,%d원%n", 
						mug.name,mug.price);
				
		
	}

}
