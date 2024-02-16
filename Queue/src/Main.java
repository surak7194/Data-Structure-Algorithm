
public class Main {

	public static void main(String[] args) {
		
		Queue q1 = new Queue();
		
		q1.insert(10);
		q1.insert(20);
		q1.insert(30);
		q1.insert(40);
		q1.remove();
		q1.insert(50);
		q1.remove();
		q1.insert(60);
	
	  //q1.insert(60);
//		
//		q1.remove();
//		q1.remove();
//		q1.remove();
//		q1.remove();
//		q1.remove();
		
		System.out.println(q1);

		Queue q2 = new Queue();
		
		q2.insert(70);
		q2.insert(80);
//		q2.remove();
		q2.insert(90);
		q2.insert(100);
		q2.insert(112);
		
	    q2.concat(q1);
		
		
		
		
	}
}

