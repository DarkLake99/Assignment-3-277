//Dmitry Merezhko	ID: 025-947-712
//Charyl Enriquez   ID: 015392154
//Britney Khuu 		ID: 018577765
import java.util.Calendar;
public abstract class TicketPurchase 
{
	private String sub;
	private Event event;
	private Calendar date;

	public TicketPurchase(String subs, Event eve, String eveDate) 
	{
		sub = subs;
		event = eve;
		date = DateUtil.convertStringDatetoCalendarDate(eveDate);
	}
	
	public String getSub()
	{
		return sub;
	}
	
	public Event getEvent()
	{
		return event;
	}
	
	public Calendar getDate()
	{
		return date;
	}
	
	@Override
	public String toString() {
		return getType() + ", Subscriber: " + getSub() + ", Event: " + 
	event.getEventName() + ", Purchase Date: " + DateUtil.getFormattedDate(date);
	}
	public abstract String getType();
}
