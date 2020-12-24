package corejava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/YYYY hh:mm:ss");
		
		System.out.println(sdf1.format(cal.getTime()));
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(Calendar.DAY_OF_WEEK);
		
		System.out.println(Calendar.WEEK_OF_YEAR);

	}

}
