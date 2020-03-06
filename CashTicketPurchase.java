//Dmitry Merezhko	ID: 025-947-712
//Charyl Enriquez   ID: 015392154
//Britney Khuu 		ID: 018577765
public class CashTicketPurchase extends TicketPurchase
{
	private int cash;
	
	//public 
	public CashTicketPurchase(String sub, Event event, String date)
	{
		super(sub, event, date);
		cash = 0;
	}
	@Override
	public String getType() {
		return "Cash";
	}
	/*
	@Override
	public String toString()
	{
		return "   Cash, Subscriber: " + this.getSub() + ", Event: " + this.getEvent() + ", Purchase Date: " + this.getDate();
	}
	*/
}
