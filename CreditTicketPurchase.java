
public class CreditTicketPurchase extends TicketPurchase {
	
	private int credit;
	/*dont actually need these constructors bc main never calls them
	public CreditTicketPurchase(Subscriber sub)
	{
		super(sub, new Event());
	}
	public CreditTicketPurchase(Subscriber sub, Event event)
	{
		super(sub, event, new DateUtil());
	}
	*/
	public CreditTicketPurchase(Subscriber sub, Event event, DateUtil date)
	{
		super(sub, event, date);
		credit = 0;
	}

}
