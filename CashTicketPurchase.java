
public class CashTicketPurchase extends TicketPurchase
{
	private int cash;
	
	//public 
	public CashTicketPurchase(String sub, Event event, String date)
	{
		super(sub, event, date);
		cash = 0;
	}
}
