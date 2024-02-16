
public class Main {
	public static void main(String[] args) {
		CLinkedList c1=new CLinkedList();
		
		Student s1=new Student("Shubh",24,'M');
		Student s2=new Student("Amy",20,'F');
		Student s3=new Student("Raj",28,'M');
		Student s4=new Student("Om",18,'M');
		Student s5=new Student("Anna",16,'f');
		Student s6=new Student("Vani",23,'f');
		
		c1.insert(s1);
		c1.insert(s2);
		c1.insert(s3);
		c1.insert(s4);
		c1.insert(s5);
		c1.insert(s6);
		//c1.insert(s1);
		
		c1.deleteByPos(2);
		c1.deleteFirst();
		c1.deleteLast();
		
		c1.append(s6);
		c1.append(s1);
		c1.append(s2);
		
		System.out.println(c1);
	}
}
