package practice5;

public class Account{
    public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
    private int balance;
   

	//생성자 작성
    public Account(String accountNo){
    	System.out.println(accountNo+"가 개설됬습니다");
    }
	public boolean withdraw(int money) {
		// 잔고보다 출금액이 더 많으면 안된다.
		if(money > balance) {
			return false;	// 잔고 부족
		} else {
			balance -= money;
			return true;	// 성공
		}
	}

	public boolean deposit(int money) {
		if(balance + money > MAX_BALANCE) {	// 잔고 한도 초과
			return false;
		} else {
			balance += money;
			return true;
		}
    
	}
	public void showBalance(int balance) {
		this.balance=balance;
	}
	 public int showBalance() {
			return balance;
		}
}
