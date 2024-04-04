import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		//	캘린더 불러오기 : .getInstance()를 통해 인스턴스 확보 가능 
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		
		custom.set(2012, 8,24);
		System.out.println("NOW:"+now);
		System.out.println("custom:"+custom);
		
		int nowYear=now.get(Calendar.YEAR);
		int nowMonth=now.get(Calendar.MONTH);
		int nowDate=now.get(Calendar.DATE);
		
		System.out.printf("오늘은 %d년,%d월,%d일 입니다 \n",
				nowYear,nowMonth,nowDate);
		Calendar future = Calendar.getInstance();
		future.add(Calendar.YEAR, 10);
		System.out.printf("10년 후 오늘은 %d년,%d월,%d일 입니다 \n",
				future.get(Calendar.YEAR),nowMonth,nowDate);
		int dow =future.get(Calendar.DAY_OF_WEEK);
		System.out.println(dow);
	}

}
