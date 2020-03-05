//Dmitry Merezhko	ID: 025-947-712
//Charyl Enriquez   ID: 015392154
//Britney Khuu 		ID: 018577765
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
		return mName + ", Born: " + DateUtil.getFormattedDate(mBirthDate);
	}
	public void addTicketPurchase(TicketPurchase t) {
		
	}
}
