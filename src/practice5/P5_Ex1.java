package practice5;

public class P5_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberApp member1=new MemberApp();
		member1.setName("정우성");
		member1.setID("jws");
		member1.setPoint(50000);
		
		MemberApp member2=new MemberApp();
		member2.setName("유재석");
		member2.setID("yjs");
		member2.setPoint(30000);
		
		MemberApp member3=new MemberApp();
		member3.setName("이효리");
		member3.setID("lhr");
		member3.setPoint(40000);
		//member1.getName();
		//member1.getID();
		//member1.getPoint();
		member1.showInfo();
		System.out.println();
		member2.showInfo();
		System.out.println();
		member3.showInfo();
		System.out.println();
		//System.out.println();
		
	}

}
