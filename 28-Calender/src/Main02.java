import java.util.Calendar;

public class Main02 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		DatePrinter.printDateTime(cal);
		
		//지금으로 부터 100일 후
		cal.add(Calendar.DAY_OF_MONTH, 100);
		DatePrinter.printDateTime(cal);
		
		// 75년 전
		cal.add(Calendar.YEAR, -75);
		DatePrinter.printDateTime(cal);
		
		// 9시간 후
		cal.add(Calendar.HOUR, 9);
		DatePrinter.printDateTime(cal);
		
		// 8달 후
		cal.add(Calendar.MONTH, 8);
		DatePrinter.printDateTime(cal);
	}

}
