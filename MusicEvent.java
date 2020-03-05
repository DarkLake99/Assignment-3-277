public class MusicEvent extends Event {
	private String mBandName;
	public MusicEvent(String eventName, Venue vObj, String date, double ticketPrice, String band) {
		super(eventName, vObj, date, ticketPrice);
		mBandName = band;
	}
	@Override
	public int compareTo(Event e) {
		//music > sporting
		if(!(e instanceof MusicEvent)) return 1;
	
		MusicEvent m = (MusicEvent)e;
		
		String bandOne = getBandName();
		String bandTwo = m.getBandName();
		
		return bandOne.compareToIgnoreCase(bandTwo);
		
	}
	
	public String getBandName()
	{
		return mBandName;
	}
}
