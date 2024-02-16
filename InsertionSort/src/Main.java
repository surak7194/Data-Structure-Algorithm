
public class Main {
	
        public static void main(String[] args)
        {
		
		int [] arr = new int[]{50, 20, 100, 5, 5, 76, 75, 11};
		
		System.out.println("Your Sorted Elements are: ");
		InsertionSort.print(arr);
		System.out.println();
		System.out.println("Your Elements in ascending order: ");
		InsertionSort.insertionAscending(arr);
		InsertionSort.print(arr);
		System.out.println();
		System.out.println("Your Elements in decending order: ");
		InsertionSort.insertionDescending(arr);
		InsertionSort.print(arr);
		
		}
        
}
