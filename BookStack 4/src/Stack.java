
public class Stack 
{
   Book [] arr;
   int top;
   static int count;
   
   public Stack()
   {
	   this.arr=new Book[5];
	   top=-1;  
   }
 ////another method of writing push pop  
   public void push(Book value)
   {
	  
	   if(top==arr.length-1)
	   {
		  System.out.println("Stack overflow"); 
	   }
	   
	   else
	   {
		   top++;
		   arr[top]=value;
		   count++;
	   }
   }
   
   public Book pop()
   {
	   Book value=null;
	   if(top==-1)
	   {
		   System.out.println("Stack underflow");
	   }
	   
	   else
	   {
		   value=arr[top];
		   top--;
		   count--;
		  
	   }
	   return value;
   }
   
   
   
	  public int maxPrice()
	  {
		 int max=arr[0].getPrice();
		 
		 for(int i=0; i<count; i++)
		 {
			 if(max<arr[i].getPrice())
			 {
				 max=arr[i].getPrice();
			 }
		 }
		 
		 return max;
		 
		 }

	
	  public String toString()
	   {
		   String str="";
		   for(int i=top; i>=0; i--)
		   {
			   str=str+(arr[i]+" ");
		   }
		   return str;
	   }
   
}
