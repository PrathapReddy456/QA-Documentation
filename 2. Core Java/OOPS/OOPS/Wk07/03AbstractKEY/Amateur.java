public class Amateur extends Exhibitor
{
	private static final int PTS_NEEDED = 150;
	
	public Amateur()
	{
		super();
	}
	public Amateur(String lastName, String firstName, int yearOfBirth, int points)
	{
		super(lastName, firstName, yearOfBirth, points);
	}
	@Override
	public boolean worldShowQualified()
	{
		return getPoints() >= PTS_NEEDED;
	}
}
