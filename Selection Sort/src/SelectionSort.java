

public class SelectionSort {

	public static void selection(int []arr)
	{
		for(int p=0; p<arr.length-1; p++)
		{
			int i=p;  //iterations in while loop
			int x = arr[i]; //first index
			
			while(i<arr.length)
			{
				if(arr[i] < x)
				{
					int tmp = arr[i];
					arr[i] = x;
					x = tmp;
				}
				i++;
			}
			arr[p] = x; //fixed position
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

