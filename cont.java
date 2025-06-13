class cont
{
	public static void main(String args[])
	{
		outerloop:
			for(int x=0;x<10;x++){
				System.out.print("\nOuter loop pass " + x + ", inner loop: ");
				
				for(int y=0;y<10;y++){
					if(y==5) continue outerloop;
					System.out.print(y);
					}
				}
	}
}