
public class Main {
	public static void main(String [] args) {
	
		LinkedList list = new LinkedList();
		list.append(1);
		list.append(1);
		list.append(2);
		list.append(3);
	     list.append(2);
		 list.append(1);
		 list.append(1);
		System.out.println(list);
//		list.deleteFirst();
//		list.deleteFirst();
//		list.deleteLast();
//		System.out.println(list);
	
		list.isPalindrome(list);
		System.out.println(list.isPalindrome(list));
	
		
	}

}
