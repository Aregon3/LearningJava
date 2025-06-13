class Sound
{
	public static void main (String args[])
	throws java.io.IOException
	{
		char ch; 
		System.out.println("Enter your weight: ");
		
		ch = (char) System.in.read();

		System.out.println("Your weight in the moon would be : " + (double)ch*6);
	}
}