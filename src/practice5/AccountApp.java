package practice5;

public class AccountApp {
	private int input;
	private int money;
	private boolean state;
	public void AccountApp(boolean state) {
		this.state=state;
	}
	public void AccountPrint(boolean state) {
	while(state) {
		System.out.println("-----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("-----------------------------");
		input=sc.nextInt();
		System.out.println("선택>"+input);
		switch(input){
			case 1:
				System.out.print("예금액>");
				i=sc.nextInt();
				money+=i;
				break;
			case 2:
				System.out.print("출금액>");
				i=sc.nextInt();
				money-=i;
				break;
			case 3:
				System.out.print("잔고액>"+money);
				break;
			case 4 :
				System.out.print("프로그램 종료");
				state=false;
				break;
			default:
				System.out.println("재입력하세요");
			
					}
	}
}