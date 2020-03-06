
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
		

				if(!(e instanceof SportingEvent)) return -1;
				
				SportingEvent c = (SportingEvent)e;
						
				String eventOneTeam = getTeamOne();
				String eventTwoTeam = c.getTeamOne();
				

				return eventOneTeam.compareToIgnoreCase(eventTwoTeam);
		
	}
	
	public String getTeamOne()
	{
		return mTeamOne;
	}
	
	public String getTeamTwo()
	{
		return mTeamTwo;
	}
	
	@Override
	public String getPerformers()
	{
		return "Teams: " + mTeamOne + " vs " + mTeamTwo;
	}
	
	@Override
	public String getType()
	{
		return "Sporting";
	}
}
