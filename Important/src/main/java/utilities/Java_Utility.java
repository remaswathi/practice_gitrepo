package utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Java_Utility {

	public int getRandomnumber() {
		Random random = new Random();
		int randomcount = random.nextInt(1000);
		return randomcount;

	}

	public String getCurrentDate() {

		Date date = new Date();
		SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
		String currentDate = sim.format(date);
		return currentDate;

	}

	public String toGetRequiredDate(int days) {

		// Get date after 30 days
		Date date = new Date();
		SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
		sim.format(date);
		Calendar cal = sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String daterequired = sim.format(cal.getTime());
		return daterequired;
	}

}
