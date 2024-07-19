
public class Crew extends Traveler{
	private String position;
	private int flightHours;
	private double payRate;
	public Crew()
	{
		super();
		position = "none";
		flightHours = 0;
		payRate = 0;
	}
	public Crew(String name, Location location, String position,int flightHours, double payRate)
	{
		super(name, location);
		this.position = position;
		this.flightHours = flightHours;
		this.payRate = payRate;
	}
	public void setPosition(String position)
	{
		this.position = position;
	}
	public String getPosition() {
		return position;
	}
	public void setFlightHours(int flightHours)
	{
		this.flightHours = flightHours;
	}
	public int getFlightHours()
	{
		return flightHours;
	}
	public void setPayRate(double payRate)
	{
		this.payRate = payRate;
	}
	public double getPayRate()
	{
		return payRate;
	}
	@Override
	public void move(SpaceShip s) {
		flightHours = flightHours + s.getFlightHours();
	}
	@Override
	public String toString()
	{
		return "Traveler[name="+super.getName()+", id="+super.getID()+", current="+super.getLocation()+ ", position=" + position + ", Pay= $" + payRate+ ", flight hours=" + flightHours +"]";
	}
}
