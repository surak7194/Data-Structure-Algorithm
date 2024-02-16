
public class Main {
	static int topIndex = -1;
	static int []arr;
	
	public static void main(String []args)
	
	{
	arr = new int[5];
	push(10);
	push(20);
	push(30);
	push(40);
	push(50);
	//push(60);
    pop();
	pop();
	pop();
	pop();
	pop();
	pop();
	print();
		
		
	}
	
	private static int push(int value)
	{
		if(topIndex < arr.length-1)
		{
			topIndex++;
			arr[topIndex]=value;
			return value;
		}
		else
			System.out.println("Stack overflow...");
        return 0;	
	}
	
	private static int pop()
	{
		if(topIndex != -1)
		{
			int value = arr[topIndex];
		    topIndex--;
		    return value;
		}
		else
			System.out.println("Stack is Underflow...");
		return 0;
	}
	
	private static void print()
	{
		for(int i = 0; i<=topIndex; i++)
		{
			System.out.print(arr[i]+", ");
		}
	}
	
}
