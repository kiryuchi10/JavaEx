package JavaTest;

import java.util.ArrayList;
import java.util.List;

public class UserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<>();
//		Staff s1=new Staff("master","m7788","운영자",3500000);
//		Customer c1 =new Customer("jung-ws","j1357913579","정우성",1000);
//		Customer c2=new Customer("LeeHR","a123!!","이효리",2500);
//		Customer c3=new Customer("jung-ws","j1357913579","정우성",1000);
//		list.add(s1);
//		list.add(c1);
//		list.add(c2);
//		list.add(c3);
		
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
	                System.out.println(user.toString());
	            }
			 
}
//		for(int i=0;i<list.size();i++) {
//			System.out.printf("%d.",i);
//			list.get(i).showInfo();
//			 if( list.get(i) instanceof Staff ) {
//	                ((Staff)list.get(i)).toString();
//	            }
//			 		list.get(i).toString();
	  }
	}
