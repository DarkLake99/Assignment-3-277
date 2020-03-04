
public class SportingEvent extends Event {
	private String mTeamOne;
	private String mTeamTwo;
	public SportingEvent(String eventName, Venue vObj, String date, 
			double ticketPrice, String teamOne, String teamTwo) {
		super(eventName, vObj, date, ticketPrice);
		mTeamOne = teamOne;
		mTeamTwo = teamTwo;
	}
	@Override
	public int compareTo(SportingEvent e) {
		
	}
}
