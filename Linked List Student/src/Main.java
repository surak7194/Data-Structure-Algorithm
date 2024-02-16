
public class Main {
	public static void main(String []args) {
		LinkedList list = new LinkedList();

		Student s1 = new Student ("Samya",20,'M');
		Student s2 = new Student ("Shubhya",23,'F');
		Student s3 = new Student ("Rushya",22,'M');
		Student s4 = new Student ("milya",22,'F');
		Student s5 = new Student ("Gaurya",21,'M');
		Student s6 = new Student ("Prachi",16,'F');
		Student s7 = new Student ("Navya",6,'F');
		
		list.insert(s1);
		list.insert(s2);
		list.insert(s3);
		list.insert(s4);
		
		list.append(s5);
		list.append(s6);
		list.append(s7);
		 
		//milya,rushya,shubhya,samya,gaurya,prachi,navya
		list.deleteFirst();
		//rushya,shubhya,samya,gaurya,prachi,navya
		list.deleteLast();
		//rushya,shubhya,samya,gaurya,prachi
		System.out.println(list);
		
		list.deleteByPos(1);
		System.out.println(list);  
		//*****OKAY******
		System.out.println();
		
		System.out.println("After reversing Student List:");
		list.reversePrint();
		
		//***OKAY****
		
//		list.reverseLinkList();
//		System.out.println(list);
		//****OKAY*****
		
		System.out.println();
	    System.out.println("Smallest age persion is:");
		list.smallestAge();
		
		System.out.println();
		System.out.println("Max age persion is:");
		list.largestAge();
		
		System.out.println();
		System.out.println("Forword print:");
		list.forwardPrint();
		
//		list.insertAfterByValue("kunal",5);
//		System.out.println(list);
		
	}
}
