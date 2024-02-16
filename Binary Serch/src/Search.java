import java.util.Scanner;

public class Search {

	int arr[];
	
	public Search(int size)
	{
		arr=new int [size];
	}
	
	public void accept_arrar()
	{
		int i;
		Scanner sc=new Scanner(System.in);
		
		for(int i = 0; i<arr.size; i++)
		{
			System.out.println("Enter number :");
			arr[i]=sc.nextInt();
		}
	}
	
	public int bin_search(int key)
	{
		int low=0;
		int high=arr.length-1;
		
		while((arr[mid]!=key)&&(low<=hight))
		{
			if(key<arr[mid])
				high=mid-1
			else
				low=mid+1;
			
			mid=(low + high)/2;
			
		}
		if(arr[mid]==key)
			return mid+1;
		else
			return -1;
	}
}
