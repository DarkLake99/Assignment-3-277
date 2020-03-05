
public class SportingEvent extends Event {
	private String mTeamOne;
	private String mTeamTwo;
	public SportingEvent(String eventName, Venue vObj, String date, 
			double ticketPrice, String teamOne, String teamTwo) {
		super(eventName, vObj, date, ticketPrice);
		mTeamOne = teamOne;
		mTeamTwo = teamTwo;
	}
	

	public int compareTo(Event e) {
		return 0;
	}
}
