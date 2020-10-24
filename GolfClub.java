
public class GolfClub 
{

	private String ClubName;
	private int Distance;
	
	public GolfClub (String ClubName, int Distance)
	{
		this.ClubName = ClubName;
		this.Distance = Distance;
	}
	public void main (String[] args)
	{
		System.out.println(this.ClubName + " " + this.Distance);
		
	}
}