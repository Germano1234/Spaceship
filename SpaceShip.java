import java.util.ArrayList;

public class SpaceShip {
	private String name;
	private int capacity;
	private ArrayList<Traveler> travelers;
	private int numTravelers = 0;
	private Location current;
	private Location destination;
	private int flightHours;
	
	public SpaceShip()
	{
		name = null;
		current = null;
		destination = null;
		capacity = 10;
		travelers.add(null);
		flightHours = 0;
	}
	public SpaceShip(String name, Location current, Location destination, int capacity,int flightHours)
	{
		this.name = name;
		this.current = current;
		this.destination = destination;
		this.capacity = capacity;
		travelers = new ArrayList<Traveler>();
		this.flightHours = flightHours;
	}
	public void setFlightHours(int flightHours)
	{
		this.flightHours = flightHours;
	}
	public int getFlightHours()
	{
		return flightHours;
	} 
	public String getName()
	{
		return name;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public Location getCurrent()
	{
		return current;
	}
	public Location getDestination()
	{
		return destination;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCurrent(Location current)
	{
		this.current = current;
	}
	public void getDestination(Location destination)
	{
		this.destination = destination;
	}
	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}
	public boolean board(Traveler t)
	{
		if (travelers.size()!=capacity)
		{
			travelers.add(t);
			numTravelers++;
			return true;
		}
		for (Traveler tr : travelers)
		{
			if (tr.getID() == t.getID())
				return false;
		}
		return false;
	}
	public boolean leave(Traveler t)
	{
		for (Traveler tr : travelers)
		{
			 if(tr.getName().equals(t.getName()))
			 {
				 travelers.remove(t);
				 return true;
			 }
		}
		return false;
	}
	public boolean isOnBoard(Traveler t)
	{
		for (Traveler tr : travelers)
		{
			 if(tr.getName() == t.getName())
			 {
				 return true;
			 }
		}
		return false;
	}
	public void move()
	{
		Location newc = current;
		current = destination;
		destination = newc;
		for (Traveler tr : travelers)
		{
			tr.setLocation(current);
			tr.move(this);
		}
		travelers.clear();
		numTravelers = 0;
	}
	public String toString()
	{
		String format = "Spaceship [name="+name+", current="+current+", destination="+destination+", capacity="+capacity+", passengers="+numTravelers+ ", flighthours =" + flightHours +"]";
		for (Traveler tr : travelers)
		{
			format = format + "\n" + tr.toString();
		}
		return format;
	}
	

}
