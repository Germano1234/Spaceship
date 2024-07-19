import java.util.ArrayList;
public class AvailableTravelers {
	private ArrayList<Traveler> travelers;
	private int numOfTravelers;
	public AvailableTravelers()
	{
		travelers = new ArrayList<Traveler>();
		numOfTravelers = 0;
	}
	public AvailableTravelers(int capacity)
	{
		travelers = new ArrayList<Traveler>();
		numOfTravelers = 0;
	}
	public ArrayList<Traveler> getTravelers()
	{
		return travelers;
	}
	public void addTraveler(Traveler t)
	{
		if (numOfTravelers > 0)
		{
			for (Traveler tr : travelers)
			{
				if (tr.getID() == t.getID())
					break;
			}
		}
		travelers.add(t);
		numOfTravelers = numOfTravelers + 1;
	}
	public Traveler findTravelerByName(String name)
	{
		for (Traveler tr : travelers)
		{
			if (tr.getName().equals(name))
				return tr;
		}
		return null;
	}
	public String toString()
	{
		String format = "";
		for (Traveler tr : travelers)
		{
			format = format + tr.toString() + "\n";
		}
		return format;
	}
}
