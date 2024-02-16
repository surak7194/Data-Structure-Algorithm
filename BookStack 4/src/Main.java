public class Main {

	public static void main(String[] args) 
	{
		Book b1=new Book(1,"Let us c","Y.Kanitkar",200);
		Book b2=new Book(2,"Serpents revenge","Sudha Murthy",150);
		Book b3=new Book(3,"Two states","Chetan Bhagat",300);
		Book b4=new Book(4,"Mrityunjay","Shivaji Sawant",500);
		Book b5=new Book(3,"Two states","Chetan Bhagat",1000);
		
		Stack s = new Stack();
		
		s.push(b1);
		s.push(b2);
		s.push(b3);
		s.push(b4); 
		s.push(b5);
		s.pop();
		System.out.println("After operation stack is: ");
		System.out.println(s);
		System.out.println("-----------------------------------------------------------------------------------------------------");
		
	    int maxPrice=s.maxPrice();
	    //String mBook=s.
		System.out.println("maximum price of book is : "+maxPrice);
		
		
		

	}
}