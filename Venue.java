//Dmitry Merezhko	ID: 025-947-712
//Charyl Enriquez   ID: 015392154
//Britney Khuu 		ID: 018577765

public class Venue implements Comparable<Venue> {
	private String mName;
	private int mCapacity;
	public Venue(String name_input, int capacity_input) {
		mName = name_input;
		mCapacity = capacity_input;
	}
	public String getName() {
		return mName;
	}
	public int getCapacity()
	{
		return mCapacity;
	}
	@Override
	public String toString()
	{
		return mName + ", Capacity: " + mCapacity;
	}
	@Override
	public int compareTo(Venue v) {
		return v.mCapacity- this.mCapacity;
	}
}
