import java.util.Scanner;
public class ExpanseTester {
	public static void main(String[] args)
	{
		AvailableTravelers av = new AvailableTravelers();
		Traveler p1 = new Passenger("Germano", Location.EARTH, SeatCategory.BUSINESS, 200);
		Traveler p2 = new Passenger("Leticia", Location.EARTH, SeatCategory.BUSINESS, 300);
		Traveler p3 = new Passenger("Marcos", Location.MARS, SeatCategory.COACH, 400);
		Traveler p4 = new Passenger("Jaqueline", Location.MARS, SeatCategory.FIRST, 600);
		Traveler c1 = new Crew("Roberto", Location.EARTH, "Captain",10, 1000.00);
		Traveler c2 = new Crew("Carlos", Location.MARS, "Captain",11, 1000.00);
		Traveler c3 = new Crew("Ronaldo", Location.EARTH, "Co-Captain",10, 500.00);
		Traveler c4 = new Crew("Fenomeno", Location.MARS, "Co-Captain",10, 500.00);
		Traveler c5 = new Crew("Neymar", Location.EARTH, "Crew Member",9, 300.00);
		Traveler c6 = new Crew("Junior", Location.MARS, "Crew Member",8, 300.00);
		av.addTraveler(p1);
		av.addTraveler(p2);
		av.addTraveler(p3);
		av.addTraveler(p4);
		av.addTraveler(c1);
		av.addTraveler(c2);
		av.addTraveler(c3);
		av.addTraveler(c4);
		av.addTraveler(c5);
		av.addTraveler(c6);
		SpaceShip s[] = new SpaceShip[2];
		s[0] = new SpaceShip("Mae", Location.EARTH, Location.RING, 20,5);
		s[1] = new SpaceShip("Pai", Location.MARS, Location.BELT, 20,5);
		
		Traveler travelerChosen = null;
		SpaceShip shipChosen = null;
		Scanner scnr = new Scanner(System.in);
		int n;
		while (true)
		{
			String na;
			String sp;
			System.out.println("1: Let Traveler board SpaceShip");
			System.out.println("2: Search for Traveler on SpaceShip");
			System.out.println("3: Move StarShip to new Location");
			System.out.println("4: Show the Travelers Available");
			System.out.println("5: Show travlers in a SpaceShip");
			System.out.println("6: Exit");
			System.out.println("Enter choice (1-6) ");
			n = scnr.nextInt();
			if (n==6)
				break;
			switch (n) {
				case 1:
					System.out.print("Boarding Traveler: ");
					na = scnr.next();

					for (Traveler test: av.getTravelers())
					{
						if (test.getName().equals(na))
						{
							travelerChosen = test;
						}
					}
					System.out.print("Boarding Ship: ");
					sp = scnr.next();
					for (SpaceShip test: s)
					{
						if (test.getName().equals(sp))
						{
							 shipChosen = test;
						}
					}
					if (shipChosen.board(travelerChosen))
					{
						System.out.print("Successful!\n");
					}
					else
						System.out.print("Unsuccessful!\n");
					System.out.print(shipChosen.toString());
					System.out.println();
					break;
					
				case 2:
					System.out.print("Searching for Traveler: ");
					na = scnr.next();
					for (Traveler test: av.getTravelers())
					{
						if (test.getName().equalsIgnoreCase(na))
						{
							travelerChosen = test;
						}
					}
					System.out.print("Searching in ship: ");
					sp = scnr.next();
					for (SpaceShip test: s)
					{
						if (test.getName().equalsIgnoreCase(sp))
						{
							 shipChosen = test;
						}
					}
					if (shipChosen.isOnBoard(travelerChosen))
					{
						System.out.print("true\n");
					}
					else
						System.out.print("false\n");
					System.out.println(travelerChosen.toString());
					System.out.println(shipChosen.toString());
					break;
				case 3:
					System.out.print("Moving Ship: ");
					sp = scnr.next();
					for (SpaceShip test: s)
					{
						if (test.getName().equalsIgnoreCase(sp))
						{
							 shipChosen = test;
						}
					}
					System.out.println(shipChosen.toString());
					shipChosen.move();
					System.out.println("After Move:");
					System.out.println(shipChosen.toString());
					System.out.println("All the passengers on this Ship got to their destination!");
					break;
				case 4:
					System.out.print(av.toString());
					break;
				case 5:
					System.out.print("Searching in ship: ");
					sp = scnr.next();
					for (SpaceShip test: s)
					{
						if (test.getName().equals(sp))
						{
							 shipChosen = test;
						}
					}
					System.out.println(shipChosen.toString());
			}
			
		}
		
	}
}
