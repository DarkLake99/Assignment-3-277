
public abstract class TicketPurchase 
{
	private Subscriber sub;
	private Event event;
	private DateUtil date;
	
	public TicketPurchase(Subscriber addSub)
	{
		this(addSub, new Event());
	}
	public TicketPurchase(Subscriber aSub, Event eve)
	{
		this(aSub, eve, new DateUtil());
	}
	public TicketPurchase(Subscriber subs, Event eve, DateUtil eveDate) 
	{
		sub = subs;
		event = eve;
		date = eveDate;
	}
	
}
