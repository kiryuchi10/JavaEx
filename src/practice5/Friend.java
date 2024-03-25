package practice5;

public class Friend {
	private String [] name;
	private String [] phone;
	private String [] school;
	public Friend(String [] name,
			String [] phone,String [] school) 
	{
		this.name=name;
		this.phone=phone;
		this.school=school;
	}
	public void printFriend() {
		for(int j=0;j<3;j++)
		{
			System.out.print("이름:"+name[j]+"\t"
					+"핸드폰:"+phone[j]+"\t"+"학교:"+school[j]);
			System.out.println();
		}
	}
}
