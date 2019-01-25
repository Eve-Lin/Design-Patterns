package factory;

import java.util.Calendar;

public class FactoryEeryDayDemo {
	
	public static void main(String [] args) {
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
		System.out.println(cal.get(cal.DAY_OF_MONTH));
		
	}

}
