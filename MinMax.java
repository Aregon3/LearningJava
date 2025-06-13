class MinMax
{
	public static void main(String args[])
	{
		int min, max;
		int nums[] = new int[10];
		
		nums[0] = 91;
		nums[1] = 17;
		nums[2] = 564;
		nums[3] = 900;
		nums[4] = 13291;
		nums[5] = -163569823;
		nums[6] = -127490;
		nums[7] = 3;
		nums[8] = 11;
		nums[9] = 1291;
		
		min = max = nums[0];
		for(int i=0; i<10; i++)
		{
			if(nums[i] < min) min = nums[i];
			if(nums[i] > max) max = nums[i];
		}
		System.out.println("Min and max: " + min + " " + max);
	}
}
			
		