package JavaTest;

public class Staff extends User{
	private int salary;

	public Staff(String id,String name, String pw, int salary) {
		super(id,name,pw);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name+"의 연봉은 " + salary*12 + "입니다";
	}
	public String showInfo() {
		return "아이디:"+id+"비번:"+pw+"이름"+name+"포인트:"+salary;
	}
}

