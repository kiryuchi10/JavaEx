package practice5;

public class P5_Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        double dollar;
		        double won;
		        won=1000000;
		        Converter.setRate(1341.30);
		        
		        
		        //100만원을 달러로 출력하기
		        dollar=Converter.toDollar(won);
		        System.out.println("백만원은 "+dollar
		        		+"달러입니다.");
		        //100달려를 원으로 출력하기
		        won=Converter.toKWR(100);
		        System.out.println("백달러는 "+won
		        		+"달러입니다.");
		        
		    }
	}

