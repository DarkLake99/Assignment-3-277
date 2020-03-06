//Dmitry Merezhko	ID: 025-947-712
//Charyl Enriquez   ID: 015392154
//Britney Khuu 		ID: 018577765
public class CreditTicketPurchase extends TicketPurchase {
	
	private int credit;

	public CreditTicketPurchase(String sub, Event event, String date)
	{
		super(sub, event, date);
		credit = 0;
	}
	
	@Override
	public String toString()
	{
		return "   Credit, Subscriber: " + this.getSub() + ", Event: " + this.getEvent() + ", Purchase Date: " + this.getDate();
	}

}
