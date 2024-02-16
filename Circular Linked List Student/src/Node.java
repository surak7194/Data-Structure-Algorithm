
public class Node {
    Student data;
	Node next;
	
	Node(Student data)
	{
		this.data=data;
		this.next=null;
	}
	
	public String toString() {
		String str=""+this.data;
		return str;
	}
}
