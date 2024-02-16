
public class Main 
{

	public static void main(String[] args) 
	{
		
	    Student []arr = new Student[4];
	    arr[0] = new Student("Sameer",26,'M');
	    arr[1] = new Student("Ajeet",27,'M');
	    arr[2] = new Student("Sneha",21,'F');
	    arr[3] = new Student("Sagar",28,'M');
		
		System.out.println("Array elements are:");
		QuickSort.print(arr);
		
		QuickSort.quickSort(arr, 0, arr.length-1);
	    System.out.println();
		System.out.println("After QuickSort Array elements are:");
		QuickSort.print(arr);
		
	
	}
}