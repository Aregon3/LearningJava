class Bubble 
{
	public static void main(String args[])
	{
		int nums[] = { 99, -10, 1234, 8732,-5, 542,
						5643, 12, - 7456, 41};
		int a, b, t;
		int size;
		
		size = 10; //number of elements to sort
		
		//display original array
		System.out.println("Original array is:");
		for( int i = 0; i < size; i++)
			System.out.print(" " + nums[i]);
		System.out.println();
		
		//This is the bubble sort
		
		for( a = 1; a < size; a++)
			for( b = size - 1; b >= a; b--) 
			{
				if( nums[b-1] > nums[b]) 
				{
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
				}
			}
			System.out.print("Sorted array is:");
			for(int i = 0; i < size; i++)
				System.out.print(" " + nums[i]);
			System.out.println();
	}
}