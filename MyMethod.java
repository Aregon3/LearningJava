class Vehicle
{
	int passengers, mpg, fuelcap;

	int range() 
	{
		return mpg * fuelcap;
	}
}

class MyMethod
{
	public static void main (String args[])
	{
		
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		int range1, range2;
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		range1 = minivan.range();
		range2 = sportscar.range();
		
		System.out.println("Minivan can carry " + minivan.passengers + 
		" passengers and has a range of " + range1 + " miles.");
		
		System.out.print ("Sportscar can carry " + sportscar.passengers + 
		" passengers and has a range of " + range2 + " miles.");
	}
}