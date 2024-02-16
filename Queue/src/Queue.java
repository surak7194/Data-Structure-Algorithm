
public class Queue {

	int [] arr;
	int F;
	int R;

	public Queue() {
		arr = new int[5];
		F=-1;
		R=-1;		
	}
	
	public Queue(int size) {
		arr = new int[size];
		F=-1;
		R=-1;		
	}

	public void insert(int value)
	{
		//Full condition
		if(R < arr.length-1) //-1<4//0<4//1<4//2<4//3<4
		{
			R++;//0//1//2//3//4
			arr[R] = value;//10//20//30//40//50

			//If this is the first value, make F++ as well
			if(F == -1)
				F++;
		}
		else
			System.out.println("Queue is full");
	}
	//*****OKAY*****
	
	public int remove()
	{
		int value=0;
		
		//Check for empty condition
		if(F != -1)
		{
			value = arr[F];
		
			//Check if this is the last value, if yes make F, R to -1. Else F++.
			if(F != R)
				F++;
			else
				F=R=-1;
		}
		else
			System.out.println("Queue is empty");
		
		return value;//10
	}
	
	public String toString() {
		String str = "";
		if(F == -1)
			str = "Queue is Empty!";
		else
		{
			for(int i=F; i<=R; i++)
			{
				str = str + arr[i] + ", ";
			}
		}
		
		return str;
	}

	public void concat(Queue q1) {
		int index=0;

		int []crr = new int[q1.arr.length + this.arr.length];
		for(int i=0; i<q1.arr.length; i++)
		{
			crr[index++]=q1.arr[i];
		}
		for(int i=0; i<this.arr.length; i++)
		{
			crr[index++]=this.arr[i];
		}
		for(int j=0; j<crr.length; j++)
		{
			System.out.print(crr[j]+", ");
		}
	    
	}
}
