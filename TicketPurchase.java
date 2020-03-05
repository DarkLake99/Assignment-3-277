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
	
}
