
public class Main {
		public static void main(String [] args)
		{
			int [] crr = new int [] {75,5,13,1,96,45,21,365};
			
			MergeSort.MergeSort(crr, 0, crr.length-1);
			System.out.println("After Merge Sort");
			MergeSort.print(crr);
		}
}
