package com.javaex.oop.goods.v3;


public class GoodsApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera =new Goods("nikon",
				400000);
		//camera.name="nikon";
		//camera.price=400000;
		//상품 정보 출력
	
		Goods notebook=new Goods("LG그램",
				900000);
		//notebook.name="LG그램";
		//notebook.price=900000;
		//상품 정보 출력
		Goods mug=new Goods("머그컵",
				2000);
		//mug.name="머그컵";
		//mug.price=2000;
		/*
		System.out.printf("%s,%d원%n", 
				camera.name,camera.price);
		System.out.printf("%s,%d원%n", 
				notebook.name,notebook.price);
		System.out.printf("%s,%d원%n", 
				mug.name,mug.price);*/
		camera.draw();
	}

}
