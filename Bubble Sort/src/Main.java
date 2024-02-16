//each element is compared with next element and iteration till last index

public class Main {

	public static void main(String[] args)
	{
		int [] arr = new int[]{50, 20, 100, 5, 76, 75, 1, 2};
		
		System.out.println("Your Array elements before sorting:");
		BubbleSort.print(arr);
		System.out.println("Your elements after Bubble Sort:");
		BubbleSort.bubbleAscending(arr);
		BubbleSort.print(arr);
		System.out.println("Your elements in decending after Bubble Sort:");
		BubbleSort.bubbleDescending(arr);
		BubbleSort.print(arr);
    }
}
