
public class Main {
	public static void main(String[]args) {
		DLinkList list=new DLinkList();
		
	
		list.insert(10);
		list.insert(20);
		list.insert(30);

		list.append(5);
		list.append(4);
		list.append(3);
		
		list.deleteFirst();
		list.insert(40);
		list.deleteLast();
		list.insertByPos(50, 6);
		list.deleteByPos(2);
		System.out.println(list);
		
		//list.reversePrint();
		list.reverse();
		System.out.println(list);
	}
}
