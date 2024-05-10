package practice_miniproject;

public class BookVO {
	private String name;
	private String phoneNumber;
	private String homeNumber;
	
	public BookVO() {}
	public BookVO(String phoneNumber, String homeNumber) {
		super();
		this.phoneNumber = phoneNumber;
		this.homeNumber = homeNumber;
	}
	public BookVO(String name, String phoneNumber, String homeNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.homeNumber = homeNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getHomeNumber() {
		return homeNumber;
	}
	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}
	@Override
	public String toString() {
		return "BookVO [name=" + name + ", phoneNumber=" + phoneNumber + ", homeNumber=" + homeNumber + "]";
	}
	
	
}
