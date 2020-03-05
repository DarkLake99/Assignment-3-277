
public class CreditTicketPurchase extends TicketPurchase {
	
	private int credit;

	public CreditTicketPurchase(String sub, Event event, String date)
	{
		super(sub, event, date);
		credit = 0;
	}

}
