
public class Main {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		Student s1 = new Student("Sameer", 10, 'M');
		Student s2 = new Student("Navya", 11, 'F');
		Student s3 = new Student("Vijay", 12, 'M');
		Student s4 = new Student("Ram", 13, 'M');
		
		s.push(s1);
		s.push(s2);
		s.pop();
		s.push(s3);
		s.push(s4);
		
		//Student result = s.pop();
		System.out.println("Operations After push/pop:");
		System.out.println(s);
		
	}
	
}
