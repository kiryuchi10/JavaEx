package practice5;

public class MemberApp {
	private int point;
	private String name;
	private String ID;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point){
		this.point=point;
	}
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID=ID;
	}
	public void showInfo() {
		System.out.printf("회원정보: %s(%s),%d점",
				name,ID,point);
	}
}
