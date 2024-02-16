public class BubbleSort {

	public static void bubbleAscending(int []arr)
	{
		for(int j=0; j<arr.length-1; j++)
		{
			for(int i=0; i<arr.length-1; i++)
			{
				if(arr[i+1] < arr[i])
				{
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
		}
	}

	public static void bubbleDescending(int []arr)
	{
		for(int j=0; j<arr.length-1; j++)
		{
			for(int i=0; i<arr.length-1; i++)
			{
				if(arr[i+1] > arr[i])
				{
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
		}
	}
	
	public static void print(int [] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();		
	} 

}
