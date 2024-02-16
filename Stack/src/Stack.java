
public class Stack {

	private int [] arr;
	private int top;

	public Stack() { 
		this.arr = new int[5];
		this.top = -1;
	}

	public Stack(int size) {
		this.arr = new int[size];
		this.top = -1;
	}

	public void push(int value)
	{
		//overflow condition
		if(this.top < this.arr.length-1)
		{
			this.top++;
			this.arr[this.top] = value;
		}
		else
			System.out.println("Overflow...");
	}

	public int pop()
	{
		if(this.top != -1)
		{
			int value = this.arr[this.top];
			this.top--;
			return value;
		}
		else
			System.out.println("Underflow...");
		return 0;
	}

	public String toString() {

		String str = "";
		if(this.top == -1)
			str = "Stack is empty";
		else
		{
			for(int i=this.top; i>=0; i--)
				str = str + (this.arr[i] + ", ");
		}

		return str;
	}
	
	public Stack concat(Stack s2)
	{
		Stack s3 = new Stack(this.arr.length + s2.arr.length);//5+7
		for(int i=0; i<=this.top; i++) //this means s1
		{
			s3.push(this.arr[i]); //s1 ka element push into s3
		}
		
		for(int i=0; i<=s2.top;i++) 
		{
			s3.push(s2.arr[i]);
		}
		return s3;
	}
////////////////////////////////////////////////////////////
	    public boolean equals(Stack x) {
		
		if(this.arr.length != x.arr.length) //s1 != s2
			return false;

		if(this.top != x.top)
			return false;


		//iterate on both arr and check each element
		for (int i = 0; i < this.top; i++) {

			if(this.arr[i] != x.arr[i])
			{
				return false;
			}
		}
		
		return true;
	}

}
