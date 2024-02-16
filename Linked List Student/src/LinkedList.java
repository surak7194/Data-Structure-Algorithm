
public class LinkedList {
    private Node head;
	
	public LinkedList() {
		this.head = null;
	}
	
	public LinkedList(Node head) {
		this.head = head;
	}
	
	public void insert(Student data) {

		Node tmp= new Node(data);

		if(head==null) {
			head=tmp;
		}
		else {
			tmp.next=head;
			head=tmp;
		}
	}
	
	public void append(Student  data) {
		Node n1= new Node(data);
		n1.next=null;
		
		if(head==null) {
			head=n1;
		}
		else {
			Node it=head;
			while(it.next!=null) 
			{
				it=it.next;
			}
			it.next=n1;
		}
	}
///////////////////////////////////////////////////////////////////	
	/*public void insertAfterByValue(Student data,Student value) {
		Node it=head;
		Node tmp= new Node(data);
		int flag=0;
		while(it!=null){
			if(it.data.getName()==value.getName()) {
				tmp.next=it.next;
				it.next=tmp;
				flag=1;
				break;
			}
			it=it.next;
		}
		System.out.println(it);
		if(flag==0) {
			System.out.println("Invalid Value Entered");
		}
	}*/
///////////////////////////////////////////////////////////////////	
	public void deleteFirst() {
		if(head==null) {
			System.out.println("Linked List is Empty!");
		}
		else {
			if(head.next==null) {
				head=null;
			}
			else {
			Node temp= head;
			head=temp.next;
			temp=null;
			}
		}
	}
	
	public void deleteLast() {
		if(head==null) {
			System.out.println("Linked List is Empty!");
		}
		else {
			if(head.next==null) {
				head=null;
			}
			 Node it= head;
			 while(it.next.next!=null) {
				 it=it.next;
			 }
			 it.next=null;
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
	
	public void insertByPos(Student data,int pos) {
		Node tmp= new Node(data);
		if(pos==1) {
			insert(data);
		}
		else if(pos==noOfNodes()+1) 
		{
			append(data);
		}
		else if(pos>1 && pos<(noOfNodes()+1)) {
			Node it=head;	// already pointing to the first node
			for(int i=1;i<pos-1;i++)  //(pos-1 as it is already pointing to head as shown above)
			{	it=it.next;
			}
			System.out.println(it.data);
			tmp.next=it.next;
			it.next=tmp;
		}
		else {
			System.out.println("Invalid Position!");
		}
	}
	
	public void deleteByPos(int pos) {
		if(pos==1) {
			deleteFirst();
		}
		else if(pos==noOfNodes()) 
		{
			deleteLast();
		}
		else if(pos>1 && pos<(noOfNodes()+1)) {
			Node it =head;
			for(int i=1;i<pos-1;i++) {
				it=it.next;
			}
			Node t =it.next;
			it.next=t.next;
			t=null;
		}
		else {
			System.out.println("Invalid Position!");
		}
	}
	
	public void reversePrint() {
		reversePrintRec(head);
		System.out.println();
	}
	
	private void reversePrintRec(Node it) {
		if(it.next!=null) {
			reversePrintRec(it.next);
		}
		System.out.print(it + ", ");
	}
	
	public void forwardPrint() {
		Node it=head;
		while(it!=null) {
			System.out.print(it + ", ");
			it=it.next;
		}
		System.out.println();
	}
	
	public void reverseLinkList() {
		Node it=head;
		Node itp=null;
		Node itn=head;
		while(it!=null) {
			itn=it.next;
			it.next=itp;
			itp=it;
			it=itn;
		}
		head=itp;
	}
	
	
	public int largestAge() {
		Node it=head;
		int lnum=it.data.getAge();
		while(it!=null) {
			if(lnum<=it.data.getAge()) {
				lnum=it.data.getAge();
			}
			it=it.next;
		}
		getStudentData(lnum);

		return lnum;
	}
	
	public int smallestAge() {
		Node it=head;
		int snum=it.data.getAge();
		while(it!=null) {
			if(snum>=it.data.getAge()) {
				snum=it.data.getAge();
			}
			it=it.next;
		}
		getStudentData(snum);
		
		return snum;
	}
	
	/*public void evenNumber() {
		Node it=head;
		while(it!=null) {
			if(it.data%2==0) {
				System.out.print(it.data + ", ");
			}
			it=it.next;
		}
		System.out.println();
	}
	
	public void oddNumber() {
		Node it=head;
		while(it!=null) {
			if(it.data%2!=0) {
				System.out.print(it.data + ", ");
			}
			it=it.next;
		}
		System.out.println();
	}*/
	
	public Node getStudentData(int value) {
		Node it=head;
		while(it!=null) {
			if(it.data.getAge()==value) {
				System.out.println(it);
			}
			it=it.next;
		}
		return it;
	}
	
	public String toString() {
		String str="";
		if(head==null) {
			str=str + "Linked list is Empty";
		}
		else {
			Node it=head;
			while(it!=null) {
				str=str + it.data + ", ";
				
				it=it.next;
			}
		}
		return str;
	}
}
