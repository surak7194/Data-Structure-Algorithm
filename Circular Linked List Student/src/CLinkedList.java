
public class CLinkedList {
	private Node head=null;
	
	public void insert(Student data) {
		Node tmp=new Node(data);
		if(head==null) {
			head=tmp;
			tmp.next=head;
		}
		else {
			Node it=head;
			while(it.next!=head) {
				it=it.next;
			}
			tmp.next=head;
			it.next=tmp;;
			head=tmp;
		}
	}
	
	public void append(Student data) {
		Node tmp=new Node(data);
		if(head==null) {
			head=tmp;
			head.next=head;
		}
		else {
			Node it=head;
			while(it.next!=head) {
				it=it.next;
			}
			it.next=tmp;
			tmp.next=head;
		}
	}
	
	public int noOfNodes() {
		if(head==null) {
			return 0;
		}
		else {
		int count=1;
		Node it=head;
		while(it.next!=head) {
			count++;
			it=it.next;
		}
		return count;
		}
	}
	
	public void insertByPos(Student data,int pos) {
		if(pos==1) {
			insert(data);
		}
		else if(pos==noOfNodes()+1) {
			append(data);
		}
		else if(pos>1&&pos<noOfNodes()+1) {
			Node tmp=new Node(data);
			Node it=head;
			for(int i=1;i<pos-1;i++) {
				it=it.next;
			}
			Node tmp1=it.next;
			it.next=tmp;
			tmp.next=tmp1;
		}
		else {
			System.out.println("Invalid Position");
		}
	}
	
	public void deleteFirst() {
		if(head==null) {
			System.out.println("Circular Link List is Empty");
		}
		else if(head.next==head) {
			head=null;
		}
		else {
			Node it=head;
			while(it.next!=head) {
				it=it.next;
			}
			Node tmp=head;
			head=tmp.next;
			it.next=head;
			tmp.next=null;
		}
	}
	
	public void deleteLast() {
		if(head==null) {
			System.out.println("Circular Linked List is Empty!");
		}
		else if(head.next==head) {
			head=null;
		}
		else {
			Node it=head;
			while(it.next.next!=head) {
				it=it.next;
			}
			Node tmp=it.next;
			it.next=head;
			tmp.next=null;
		}
	}
	
	public void deleteByPos(int pos) {
		if(pos==1) {
			deleteFirst();
		}
		else if(pos==noOfNodes()) {
			deleteLast();
		}
		else if(pos>1&&pos<noOfNodes()) {
			Node it=head;
			for(int i=1;i<pos-1;i++) {
				it=it.next;
			}
			Node tmp=it.next;
			it.next=tmp.next;
			tmp.next=null;
		}
		else {
			System.out.println("Invalid position");
		}
	}
		
	public String toString() {
		String str="";
		if(head==null) {
			str="Circular LinkList is Empty";
		}
		else {
			str=str+head+", \n";
			Node it=head.next;
			while(it!=head) {
				str=str+it.data+", \n";
				it=it.next;
			}
		}
		return str;
	}
}
