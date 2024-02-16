
public class Node {
	
	String data;
	Node next;
	
	public Node() {
		data = null;
		next = null;
	}
	
	public Node(String data) {
		this.data = data;
		this.next = null;
	}
	
	public Node(String data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	@Override
	public String toString() {
		return ("" + data);
	}
}
