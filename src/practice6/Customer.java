package practice6;

public class Customer extends Person {
	private int cusNum;
	private int pointNum;
	
	
	public Customer(int cusNum,int pointNum) {
		super(null,null);
		this.cusNum=cusNum;
		this.pointNum=pointNum;
	}
	public Customer(String name,String number
			,int cusNum,int pointNum) {
		super(name,number);
		this.cusNum=cusNum;
		this.pointNum=pointNum;
	}
	public int getcusNum() {
		return cusNum;
	}
	public void setcusNum(int cusNum) {
		this.cusNum=cusNum;
	}
	public int getpointNum() {
		return cusNum;
	}
	public void setpointNum(int cusNum) {
		this.pointNum=pointNum;
	}
	public void showInfo() {
		System.out.printf("이름은:%s, 번호는 %s, 고객번호는는 %d, 점수는 %d",
				super.getName(),super.getnumber(),cusNum,pointNum);
		System.out.println();
	}
}
