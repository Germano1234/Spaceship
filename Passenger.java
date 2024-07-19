
public class Passenger extends Traveler {
	private double cost;
	private SeatCategory seat;
	private int rewardsPoints;
	public Passenger()
	{
		super();
		cost = 0;
		seat = null;
		rewardsPoints = 0;
	}
	public Passenger(String name, Location location, SeatCategory seat, int rewardsPoints)
	{
		super(name, location);
		this.seat = seat;
		this.rewardsPoints = rewardsPoints;
		switch (seat)
		{
			case NOSEAT:
				cost = 0;
				break;
			case FIRST:
				cost = 1499.00;
				break;
			case BUSINESS:
				cost = 998.00;
			case COACH :
				cost = 449.00;
		}
	}
	public double getCost()
	{
		return cost;
	}
	public void setSeatCategory(SeatCategory seat)
	{
		this.seat = seat;
		switch (seat)
		{
			case NOSEAT:
				cost = 0;
				break;
			case FIRST:
				cost = 1499.00;
				break;
			case BUSINESS:
				cost = 998.00;
			case COACH :
				cost = 449.00;
		}
	}
	public SeatCategory getSeatCategory()
	{
		return seat;
	}
	public int getRewardsPoints()
	{
		return rewardsPoints;
	}
	public void setRewardsPoints(int rewardsPoints)
	{
		this.rewardsPoints = rewardsPoints;
	}
	
	@Override
	public String toString()
	{
		return "Traveler[name="+super.getName()+", id="+super.getID()+", current="+super.getLocation()+ ", seat=" + seat + ", cost= $" + cost+ ", rewardsPoitnts=" + rewardsPoints +"]";
	}
	
	@Override
	public void move(SpaceShip s)
	{
		if (rewardsPoints > 10000)
		{
			if (seat != SeatCategory.FIRST)
			{
				seat = SeatCategory.FIRST;
			}
			else
			{
				cost = 1499.00-1499.00*0.2;
				rewardsPoints = 0;
			}			
		}
		rewardsPoints = rewardsPoints + s.getFlightHours()*100;
	}
}
