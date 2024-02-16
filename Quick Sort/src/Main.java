
public class Main 
{

	public static void main(String[] args) 
	{
		
		int [] arr = new int[]{25,10,65,1,8,2,15,17};
		
		System.out.println("Array elements are:");
		QuickSort.print(arr);
		
		QuickSort.quickSort(arr, 0, arr.length-1);
	    System.out.println();
		System.out.println("After QuickSort Array elements are:");
		QuickSort.print(arr);
		
	
	}
}