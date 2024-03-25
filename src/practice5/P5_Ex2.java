package practice5;

public class P5_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera=new Goods();
		Goods cup = new Goods("머그컵",2000);
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showinfo();
		cup.showinfo();
	}

}
