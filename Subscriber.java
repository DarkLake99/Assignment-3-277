import java.util.Calendar;
public class Subscriber 
{
	public Subscriber(String name_input, String date_input) {
	 	mName = name_input;
		mBirthDate = DateUtil.convertStringDatetoCalendarDate(date_input);
	}
	
	
	private String mName;
	private Calendar mBirthDate;

}
