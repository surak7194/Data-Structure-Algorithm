/*write a function to return the number of student who have scored 70
  from a given list of marks  */

public class myClass {

	static int input[] = new int[20];
	
	public static int count(int key)
	{
		int low,high,cnt,mid;
		low =0;
		high = input.length-1;
		mid=(low+high)/2;
		cnt=0;
		
		while((input[mid]!=key)&&(low<high))
		{
			if(key < input[mid])
				high = mid -1;
			else
				low = mid +1;
			mid=(low + high)/2;
		}
		
		if(input[mid]==key)
		{
			cnt = cnt+ 1;
			low = mid -1;
			while(input[low]==key)
			{
				cnt = cnt+1;
				low = low-1;
			}
			high = mid+1;
		
			while(input[high]==key)
			{
				cnt = cnt+1;
				high = high+1;
			}
		}
		return cnt;
	}
//_____________________________________	
	public int height(Node r_ref)
	{
		int h_left, h_right;
		if(r_ref==null)
			return 0;
		
		h_left = height(r_ref.left);
		
		h_right = height(r_ref.right);
		
		if(h_left > h_right)
			return 1+h_left;
		else
			return 1+h_right;
		
	}
	
	public static void main(String[] args) {
		{
			
			System.out.println(count(70)+" student ");
		}
	}
}
