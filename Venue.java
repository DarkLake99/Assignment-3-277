
public class Venue implements Comparable {
	private String mName;
	private int mCapacity;
	public Venue(String name_input, int capacity_input) {
		mName = name_input;
		mCapacity = capacity_input;
	}
	@Override
	public int compareTo(Event v) {
		return this.mCapacity - v.mCapacity;
	}
}
