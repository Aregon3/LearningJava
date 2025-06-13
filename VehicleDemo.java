class Vehicle
{
	int passengers, fuelcap, mpg;
	
	void range()
	{
		System.out.println("Range is " + fuelcap * mpg);
	}
}

class VehicleDemo
{
	public static void main(String args[])
	{
		Vehicle sportscar = new Vehicle();
		Vehicle minivan = new Vehicle();
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		
		System.out.print("Minivan can carry " + minivan.passengers + ". ");
		minivan.range();
		System.out.print ("Sportscar can carry " + sportscar.passengers + ". ");
		sportscar.range();
	}
}