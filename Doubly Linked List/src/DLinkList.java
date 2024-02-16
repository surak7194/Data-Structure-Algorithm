
public class DLinkList {
	private Node head=null;
	private Node tail=null;
	
	public void insert(int data) {
		Node tmp=new Node(data);
		if(head==null) {
			head=tmp;
			tail=tmp;
		}
		else {
			head.prev=tmp;
			tmp.next=head;
			head=tmp;
		}
	}
	
	public void append(int data) {
		Node tmp=new Node(data);
		if(tail==null) {
			tail=tmp;
			head=tmp;
		}
		else {
			tail.next=tmp;
			tmp.prev=tail;
			tail=tmp;
		}
	}
	
	public void deleteFirst() {
		if(head==null) {
			System.out.println("Doubly Link List is Empty");
		}
		else {
			if(head.next==null) {
				head=null;
				tail=null;
			}
			else {
				Node tmp=head;
				head=head.next;
				head.prev=null;
				tmp.next=null;
			}
		}
	}
	
	public void deleteLast() {
		if(tail==null) {
			System.out.println("Doubly Link List is Empty");
		}
		else {
			if(tail.prev==null) {
				tail=null;
				head=null;
			}
			else {
				Node tmp=tail;
				tail=tail.prev;
				tail.next=null;
				tmp.prev=null;
			}
		}
	}
	
	private int noOfNodes() {
		int count=0;
		Node it=head;
		while(it!=null) {
			it=it.next;
			count++;
		}
		return count;
	}
	
	public void insertByPos(int data,int pos) {
		if(pos==1) {
			insert(data);
		}
		else if(pos==noOfNodes()+1){
			append(data);
		}
		else if(pos>1 && pos<noOfNodes()+1) {
			Node tmp=new Node(data);
			Node it=head;
			for(int i=1;i<pos-1;i++) {
				it=it.next;
			}
			tmp.next=it.next;
			it.next=tmp;
			tmp.next.prev=tmp;
			tmp.prev=it;
		}
		else 
		{
			System.out.println("Invalid Position!");
		}
	}
	
	public void deleteByPos(int pos) {
		if(pos==1) {
			deleteFirst();;
		}
		else if(pos==noOfNodes()){
			deleteLast();;
		}
		else if(pos>1 && pos<noOfNodes()) {
			Node it=head;
			for(int i=1;i<pos-1;i++) {
				it=it.next;
			}
			Node tmp=it.next;
			tmp.next.prev=tmp.prev;
			it.next=tmp.next;
			tmp.next=null;
			tmp.prev=null;
		}
		else 
		{
			System.out.println("Invalid Position!");
		}
	}
	
	public void reverse() {
		Node tmp;
		Node it=head;
		while(it!=null) {
			tmp=it.next;
			it.next=it.prev;
			it.prev=tmp;
			
			it=it.prev;
		}
		tmp=head;
		head=tail;
		tail=tmp;
	}

	public void reversePrint() {
		Node it=tail;
		while(it!=null) {
			System.out.print(it+", ");
			it=it.prev;
		}
		System.out.println();
	}
	
	public String toString() {
		String str="";
		if(head==null) {
			str=str+"Doubly Link List is Empty";
		}
		else {
			Node it=head;
			while(it!=null) {
				str=str+it+", ";
				it=it.next;
			}
		}
		return str;
	}
}
