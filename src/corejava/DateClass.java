package corejava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date);
		
		System.out.println(date.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		System.out.println(sdf.format(date));
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/YYYY hh:mm:ss");
		System.out.println(sdf1.format(date));

	}

}
