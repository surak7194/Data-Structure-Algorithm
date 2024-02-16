
public class Node {
	 Node prev;
	 int data;
	 Node next;
	
	Node(){
		this.prev=null;
		this.data=0;
		this.next=null;
	}
	
	Node(int data){
		this.prev=null;
		this.data=data;
		this.next=null;
	}
	
	Node(Node prev,int data,Node next){
		this.prev=null;
		this.data=data;
		this.next=next;
	}
	
	public String toString() {
		return ("" + this.data);
	}
}
