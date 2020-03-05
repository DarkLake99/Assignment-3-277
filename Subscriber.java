import java.util.Calendar;
public class Subscriber 
{
	private String mName;
	private Calendar mBirthDate;

	public Subscriber(String name_input, String date_input) {
	 	mName = name_input;
		mBirthDate = DateUtil.convertStringDatetoCalendarDate(date_input);
	}
	@Override
	public String toString() {
		return mName + ", Born: " + mBirthDate;
	}
	public void addTicketPurchase(TicketPurchase t) {
		
	}
}
