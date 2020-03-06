import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

public abstract class Event implements Comparable<Event> {
	private String mEventName;
	private Venue mVenueName;
	private Calendar mDate;
	private double mTicketPrice;
	private List<TicketPurchase> mTickets; //CONTAINMENT
	
	public Event(String event_name, Venue venue_name, String date, double price) {
		mEventName = event_name;
		mVenueName = venue_name;
		mDate = DateUtil.convertStringDatetoCalendarDate(date);
		mTicketPrice = price;
		mTickets = new ArrayList<TicketPurchase>();
	}
	
	/*@Override
	public int compareTo()
	{
		return 0;
	} */
	
	public String getEventName()
	{
		return mEventName;
	}
	
	public double getTicketPrice() {
		return mTicketPrice;
	}
	
	public Venue getVenue()
	{
		return mVenueName;
	}
	
	public Calendar getDate()
	{
		return mDate;
	}
	@Override
	public String toString()
	{
		return "Type: " + getType() +", Name: " + mEventName +", Venue: " + mVenueName + ", Occurs On: " + DateUtil.getFormattedDate(mDate) + ", Ticket Price: " + mTicketPrice + ", " + getPerformers();
	}
	public void addTicketPurchase(TicketPurchase t) {
		mTickets.add(t);
	}

	public ArrayList<TicketPurchase> getTicketPurchases(String beforeDate){
		ArrayList<TicketPurchase> tickets = new ArrayList<TicketPurchase>();
		Calendar bDate = DateUtil.convertStringDatetoCalendarDate(beforeDate);
		
		for (TicketPurchase t : mTickets) {
			if (t.getDate().before(bDate)) tickets.add(t);
		}
		return tickets;
	}
	
	public abstract String getType();
	public abstract String getPerformers();
	
	
}
