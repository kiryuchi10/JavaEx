package practice6;

public class ShapeApp {
	public static void main(String[] args) {
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		
		Triangle t1 = new Triangle();
		System.out.println("================");
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
		
		Triangle t1 = new Triangle(5, 5);
		t1.setFillColor("빨강");
		t1.setLineColor("파랑");
		t1.showInfo();
	}
}
