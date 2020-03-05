import java.util.Calendar;
public abstract class TicketPurchase 
{
	private Subscriber sub;
	private Event event;
	private Calendar date;
	/*
	public TicketPurchase(Subscriber addSub)
	{
		this(addSub, new Event());
	}
	public TicketPurchase(Subscriber aSub, Event eve)
	{
		this(aSub, eve, new DateUtil());
	}
	*/
	public TicketPurchase(Subscriber subs, Event eve, String eveDate) 
	{
		sub = subs;
		event = eve;
		date = DateUtil.convertStringDatetoCalendarDate(eveDate);
	}
	
}
