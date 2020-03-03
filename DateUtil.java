import java.util.Calendar;

public class DateUtil 
{

	public static Calendar convertStringDatetoCalendarDate(String date)
	{
		Calendar cDate = Calendar.getInstance();
		// Months are 0-based
		cDate.set(getYear(date), getMonth(date) - 1, getDay(date));
		
		return cDate;
	}
	
	public static String getFormattedDate(Calendar cDate)
	{
		return getMonth(cDate.get(Calendar.MONTH)) + "-" + cDate.get(Calendar.DAY_OF_MONTH) + "-" + cDate.get(Calendar.YEAR);
	}
	
	private static int getDay(String date)
	{
		return getPart(date, 2, 4);
	}
	
	private static int getMonth(String date)
	{
		return getPart(date, 0, 2);
	}
	
	private static int getYear(String date)
	{
		return getPart(date, 4, 8);
	}
	
	private static int getPart(String date, int from, int to)
	{
		return Integer.parseInt(date.substring(from, to));
	}
	
	private static String getMonth(int month)
	{
		switch(month)
		{
			case 0: return "Jan";
			case 1: return "Feb";
			case 2: return "Mar";
			case 3: return "Apr";
			case 4: return "May";
			case 5: return "Jun";
			case 6: return "Jul";
			case 7: return "Aug";
			case 8: return "Sep";
			case 9: return "Oct";
			case 10: return "Nov";
			case 11: return "Dec";
			default: return "???";
		}
	}
	
}
