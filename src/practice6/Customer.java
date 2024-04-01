package practice6;

public class Customer extends Person {
	//private int cusNum;
	private int pointNum;
	
	
	public Customer(int pointNum) {
		super(null,null);
		this.pointNum=pointNum;
	}
	public Customer(String name,String number
			,int pointNum) {
		super(name,number);
		this.pointNum=pointNum;
	}
	public int getpointNum() {
		return pointNum;
	}
	public void setpointNum(int pointNum) {
		this.pointNum=pointNum;
	}
	public void showInfo() {
		System.out.printf(" 아이디는 %s,번호:%s, 이름 %d, 점수는 %d",
				super.getName(),super.getnumber(),super.getName(),pointNum);
		System.out.println();
	}
}
