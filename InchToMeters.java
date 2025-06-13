class InchToMeters
{
	public static void main (String args [])
	{
		double inch, feet, meter;
		int counter;
		
		counter = 0;
		for(feet = 1; feet <=12; feet++)
		{
			inch = feet * 12;
			meter = inch / 39.37;
			System.out.println( feet + " feet is " + inch + " inches which is " + meter + " meters");
			counter ++;
			if(counter==1)
			{
				System.out.println();
				counter = 0;
			}
		}
	}
}