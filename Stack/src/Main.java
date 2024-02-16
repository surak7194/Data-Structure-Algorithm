
public class Main {

	public static void main(String[] args) {
		
		Stack s1 = new Stack();  //default
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		//s1.push(50);
		
		System.out.println("Stack S1 elements are: "+s1);
		
		Stack s2 = new Stack(5); ///parameterised
			
		s2.push(10);
		s2.push(20);
	    s2.push(30);
		s2.push(40);
		
		System.out.println("Stack S2 elements are: "+s2);
		
		
		Stack s3 = s1.concat(s2);
		
		System.out.println("After concatination Stack S3 elements are: "+s3);
		
		
		if(s1.equals(s2))
			System.out.println("s1 and s2 are same...");
		else
			System.out.println("s1 and s2 are different...");
		
	}
	
}
