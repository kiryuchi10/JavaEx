package practice5;

public class Goods {
// 생성자를 하나도 선언하지 않을 경우
//자바 컴파일러가 기본생성자를 추가
//개발자가 생성자를 만들었을 경우,
//기본 생성자는 추가 되지 않는다
//생성자
	//getter, setter 가 없으면 read only 필드를 만들수 있다
	//getter/setter 모두가 없으면 private이 된다 
	private static String name;
	private static int price;
	public Goods(){
		this(name,price);
	}
	public Goods(String name, int price) {
		this.name=name;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void showinfo() {
		System.out.printf("상품 이름: %s%n가격: %,d%n",
				name, price);
		System.out.println();
		}
}
