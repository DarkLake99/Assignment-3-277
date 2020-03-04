import java.util.Calendar;

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
}
