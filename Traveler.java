
public abstract class Traveler {
	private static int nextIDNum = 0;
	private String name;
	private int id;
	private Location current;
	
	public Traveler()
	{
		name = null;
		current = null;
		id = nextIDNum;
		nextIDNum++;
	}
	public Traveler(String name, Location location)
	{
		this.name = name;
		current = location;
		id = nextIDNum;
		nextIDNum++;
	}
	public String getName()
	{
		return name;
	}
	public int getID()
	{
		return id;
	}
	public void setID()
	{
		nextIDNum++;
		id = nextIDNum;
	}
	public Location getLocation()
	{
		return current;
	}
	public void setLocation(Location location)
	{
		current = location;
	}
	public abstract String toString();
		//return "Traveler[name="+name+", id="+id+" current="+current+"]";
	public void setName(String name)
	{
		this.name = name;
	}
	public abstract void move(SpaceShip s);
}
