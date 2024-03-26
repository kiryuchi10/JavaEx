package practice5;
import java.util.Scanner;

public class P5_Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]=new String[3];
		String phone[]=new String[3];
		String school[]=new String[3];
		System.out.println("친구를 3명 등록해주세요");
		for(int i=0;i<3;i++)
		{
			Scanner input1=new Scanner(System.in);
			System.out.print("이름:");
			name[i]=input1.next();
			System.out.print("핸드폰:");
			phone[i]=input1.next();
			System.out.print("학교:");
			school[i]=input1.next();
			System.out.println("----------------------------");
		}
		Friend p1=new Friend(name,phone,school);
		p1.printFriend();
				//,phone,school);
	}

}
