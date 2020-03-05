import java.util.Calendar;
import java.util.ArrayList;

public abstract class Event implements Comparable<Event> {
	private String mEventName;
	private Venue mVenueName;
	private Calendar mDate;
	private double mTicketPrice;
	
	public Event(String event_name, Venue venue_name, String date, double price) {
		mEventName = event_name;
		mVenueName = venue_name;
		mDate = DateUtil.convertStringDatetoCalendarDate(date);
		mTicketPrice = price;
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
		return "Event: " + mEventName +" Venue: " + mVenueName.getName() + " Date: " + mDate + " Price: " + mTicketPrice;
	}
	public abstract void addTicketPurchase(TicketPurchase t);
	
}
