public class Youth extends Exhibitor
{
	private static final int PTS_NEEDED = 250;
	private static final int NUMBER_OF_EVENTS= 2;
	private int numEvents;
	
	public Youth()
	{
		super();
	}
	public Youth(String lastName, String firstName, int yearOfBirth, 
			int points, int numEventsIn)
	{
		super(lastName, firstName, yearOfBirth, points);
		numEvents = numEventsIn;
	}
	@Override
	public boolean worldShowQualified()
	{
		return getPoints() >= PTS_NEEDED && numEvents >= NUMBER_OF_EVENTS;
	}
	public int getNumEvents()
	{
		return numEvents;
	}
	public void setNumEvents(int numEvents)
	{
		this.numEvents = numEvents;
	}
	@Override
	public String toString()
	{
		return super.toString() + " " + numEvents;
	}
}
