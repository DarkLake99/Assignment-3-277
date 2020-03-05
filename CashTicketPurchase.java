
public class CashTicketPurchase extends TicketPurchase
{
	private int cash;
	/*
	public CashTicketPurchase(Subscriber sub)
	{
		super(sub, new Event());
	}
	public CashTicketPurchase(Subscriber sub, Event event)
	{
		super(sub, event, new DateUtil());
	}
	*/
	public CashTicketPurchase(Subscriber sub, Event event, String date, int cashPurchase )
	{
		super(sub, event, date);
		cash = cashPurchase;
	}
}
