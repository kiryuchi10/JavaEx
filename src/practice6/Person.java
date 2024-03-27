package practice6;

public class Person {
	private String name;
	private String number;

	public Person(String name, String number)
	{
		this.name=name;
		this.number=number;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getnumber(){
		return number;
	}
	public void setnumber(String number){
		this.number=number;
	}
	public void showInfo() {
		System.out.printf("이름은:%s, 번호는 %s",
				name,number);
		System.out.println();
	}
}
