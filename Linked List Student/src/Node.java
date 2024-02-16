
public class Node {
	 Student data;
	 Node next;
	
	Node(){
		this.data=null;
		this.next=null;
	}
	
	Node(Student data){
		this.data=data;
		this.next=null;
	}
	
	Node(Node next){
		this.data=null;
		this.next=next;
	}
	
	Node(Student data,Node next){
		this.data=data;
		this.next=next;
	}
	
	public String toString() {
		return ("" + this.data);
	}
}


