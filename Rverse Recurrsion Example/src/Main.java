
public class Main {
	
	public static void main(String []args)
	{
		int n=5;
		System.out.println("Reverse Recurrsion: ");
		printnum(n);

	}

	public static void printnum(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.print(n+", ");
		printnum(n-1);
	}
}
