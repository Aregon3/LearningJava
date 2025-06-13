class project
{
	public static void main (String args[])
	throws java.io.IOException{
		
		char ch, answer = 'K';
		
		do{
			System.out.println("I am thinking of a letter between A and Z");
			System.out.print("Can you guess it: ");
			ch= (char)System.in.read();
			
			do{
				ignore = (char) System.in.read();
			}while ( ignore != '\n');
			
			if ( ch == answer )System.out.println("You are correct");
			else
			{
				System.out.print("...Sorry, you are ");
				if(ch<answer)System.out.println("too low.");
				else System.out.println("too high.");
				System.out.println("Try again.");
			}
		}while ( answer != ch);
		
	}
}	