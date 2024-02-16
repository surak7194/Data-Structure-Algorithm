
public class Main {
	
	public static void main(String[] args) {
		
		CLinkedList c1 = new CLinkedList();
		
		c1.insert(10);
		//c1.deleteLast();
		//System.out.println(c1);
		c1.insert(20);
		c1.insert(30);
		c1.append(5);
		c1.append(15);
		c1.append(25);
		c1.deleteFirst();
		c1.deleteLast();
		c1.insertByPos(50, 2);
		c1.deleteByPos(2);
		System.out.println(c1);
		//c1.noOfNodes();
	}
}

