//First element is compared with all those elements

public class Main {

	public static void main(String[] args) {
		
		int [] arr = new int[]{50, 20, 100, 5, 76, 75, 1, 2};
		
		System.out.println("Your Array elements before sorting:");
		SelectionSort.print(arr);
		SelectionSort.selection(arr);
		System.out.println("Your elements after Selection Sort:");
		SelectionSort.print(arr);
		
	}
}
