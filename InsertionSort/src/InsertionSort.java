
public class InsertionSort {

	public static void insertionAscending(int []arr)
	{
		for(int j=1; j<arr.length; j++)//holding index of array
		{
			int i=j;//i=1//i=2  //i is taking as comparision
			while(i>0) //1>0true//0>0false//2>0
			{
				if(arr[i] < arr[i-1]) //20<50true//100<20false
				{
					int tmp=arr[i];//tmp=20//100
					arr[i] = arr[i-1];//arr[1]=50
					arr[i-1]=tmp;//arr[0]=20
					i--; //next iteration again compare with 0 so i-- for while loop
				}
				else
					break;
			}
		}
	}
	
	public static void insertionDescending(int []arr)
	{
		for(int j=1; j<arr.length; j++)
		{
			int i=j;
			while(i>0)
			{
				if(arr[i] > arr[i-1])  //only change the < sign to >
				{
					int tmp=arr[i];
					arr[i] = arr[i-1];
					arr[i-1]=tmp;
					i--;
				}
				else
					break;
			}
		}
	}
	
	public static void print(int [] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{  
			System.out.print(arr[i] + ", ");
		}
		System.out.println();		
	}

}
