package com.javaex.evaluation.ev01;

import java.util.ArrayList;
import java.util.List;

public class UserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<>();
		
		list.add(new Staff("master","m7788","운영자",3500000));
		list.add(new Customer("jung-ws","j1357913579","정우성",1000));
		list.add(new Customer("LeeHR","a123!!","이효리",2500));
		list.add(new Customer("ms-park","y2345","박명수",1200));
		//list.add(new Customer("ms-park","y2345","박명수",1200));)
		
			int count=0;
			for (User user : list) {
				count++;
				System.out.printf("%d",count);
	            System.out.println(user.showInfo());

	            if (user instanceof Staff) {
	                
	            }
	               
			}
			System.out.println(list.get(0).toString()); 

	  }
	}
