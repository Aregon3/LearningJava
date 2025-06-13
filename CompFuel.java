class Vehicle
{
	int passengers, mpg, fuelcap;

	Vehicle (int p, int m, int f){
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	int range()
	{
		return mpg * fuelcap;
	}
	double fuelneeded(int miles) 
	{
		return (double) miles / mpg;
	}
}

class CompFuel
{
	public static void main (String args[])
	{
		
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportscar = new Vehicle(2,14,12);
		
		double gallons;
		int dist = 252;
		
		gallons = minivan.fuelneeded (dist);
		
		System.out.println("To go " + dist + " miles the minivan needs " +
		gallons + " gallons of fuel.");
		
		gallons = sportscar.fuelneeded (dist);
		
		System.out.print ("To go " + dist + " miles the sportscar needs " +
		gallons + " gallons of fuel.");
	}
}