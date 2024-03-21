package com.javaex.basic.reftype;

public class ArrayMuktuDimEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] twoDimen =new int[5][10];
		int[][]table= {{1,2,3,4,5,6,7,8,9,10},
				      {2,3,4,5,6,7,8,9,10,1},
				      {3,4,3,4,5,6,7,8,9,10},
				      {4,5,4,5,6,7,8,9,10,1},
				      {5,6,4,5,6,7,8,9,10,1}
		};
		System.out.println(table);
		System.out.println("Table.length:"+table.length);
		System.out.println("Table table[0].length:"+table[0].length);
		
		int sum=0;
			//행루프
		for (int row=0;row<table.length;row++) {
			//열루프
			for(int col=0;col<table[row].length;col++) {
				System.out.print(table[row][col]+"\t");
				sum+=table[row][col];
			}
			System.out.println();
		}
		System.out.println(sum);
 	}

}
