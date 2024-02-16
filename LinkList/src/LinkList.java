
public class LinkList {

	private Node head;

	public LinkList() {
		this.head = null;
	}

	public LinkList(Node head) {
		this.head = head;
	}

	public void insert(int data)
	{
		Node tmp = new Node(data);

		if(head == null)
		{
			head = tmp;
		}
		else
		{
			tmp.next = head;
			head = tmp;
		}
	}

	public void append(int data)
	{
		Node tmp = new Node(data);
		if(head == null)
		{
			head = tmp;
		}
		else
		{
			Node it = head;

			while(it.next != null)
			{
				it = it.next;
			}

			//it reached at last node
			it.next = tmp;
			tmp.next = null;
		}
	}

	public void deleteFirst()
	{                                             
		if(head == null)
		{
			System.out.println("LL is empty");
		}
		else
		{
			//Check if only 1 node in LL
			if(head.next == null)
			{
				head = null;
			}                ///****OKAY****
			else
			{
				//More than 1 node..
				Node t = head;   //Node t means reference
				head = t.next;   
				t.next = null;
			}
		}
	}

	public void deleteLast()
	{                                             
		if(head == null)
		{
			System.out.println("LL is empty");
		}

		else    
		{
			//Check if only 1 node in LL
			if(head.next == null)
			{
				head = null;
			}                
			else
			{
				//More than 1 node..
				Node t = head;   //Node t means reference
				while(t.next.next != null)
				{
					t = t.next;   
				}
				t.next = null;
			}
		}//****OKAY*****
	}
	//////////////////////////////////////////////////////////////////////
	/*this function will return LL length*/

	public int getLLength()
	{
		int noOfNodes = 0;
		Node it = head; //iterator
		while(it != null)
		{
			noOfNodes++;
			it = it.next;
		}
		System.out.println("No of Nodes before operation are: "+noOfNodes);
		return noOfNodes;
	}


	public void insertBypos(int value ,int pos)
	{

		System.out.println("Insert Position = "+pos+", Value = "+value);
		int noOfNodes = getLLength();

		if(pos == 1)        ///for first position
		{
			insert(value);
		}

		else if(pos == noOfNodes+1)     ///for last position
		{
			append(value);

		}

		else if(pos > 1 && pos < noOfNodes+1)   ///for middle position 4>1 && 4 < 7
		{
			Node it = head;
			for(int i= 1 ; i<pos-1 ; i++) //suppose pos = 3  ... 1<3//2<3//3<3
			{

				it = it.next;
			}

			Node tmp = new Node(value);
			tmp.next = it.next;    
			it.next = tmp;    ///break the chain
		}

		else
		{
			System.out.println("Invalid Position....");
		} 
	}
	//////////////////////////////////////////////////////////////////////////////////////////


	public void deleteBypos(int pos)
	{

		System.out.println("Delete Position = "+pos);
		int noOfNodes = getLLength();

		if(pos == 1)        ///for first position
		{
			deleteFirst();
		}

		else if(pos == noOfNodes)     ///for last position
		{
			deleteLast();

		}

		else if(pos > 1 && pos < noOfNodes+1)   ///for middle position 4>1 && 4 < 7
		{
			Node it = head;
			for(int i= 1 ; i<pos-1 ; i++) //suppose pos = 3  ... 1<3//2<3//3<3
			{

				it = it.next;
			}

			Node t = it.next;  

			it.next = t.next;    ///break the chain

			t.next = null;
		}

		else
		{
			System.out.println("Invalid Position....");
		} 
	}

	////////////////////////////////////////////////////////////////////////////////////////
	/*reverse string using recurssion*/


	public void reversePrint()
	{
		reversePrintRec(head);
		System.out.println();
	}

	private void reversePrintRec(Node it)
	{
		if(it.next != null)

			reversePrintRec(it.next);


		System.out.print(it.data + ", ");
	}

	///////////reverse linked list////////////////////////////

	public void reverseLinkList() 
	{
		Node it = head; //new iterator jo head ko point karega
		Node itp = null;
		Node itn = head;//point to next node head
		while(it != null) 
		{
			itn = it.next;  //itn(head) = 22
			it.next = itp;   //it.next(22) = itp(null)which will point to null
			itp = it;  // 11
			it = itn;
		}
		head = itp;


	}

	/////////////largest number//////////////////////////////////
	public int largestNumber() 
	{
		Node it=head;
		int lnum=it.data;
		while(it!=null) {
			if(lnum<it.data) {
				lnum=it.data;
			}
			it=it.next;
		}
		return lnum;
	}


	/////////////////////////smallest number//////////////////////
	public int smallestNumber() {
		Node it=head;
		int snum=it.data;
		while(it!=null) 
		{
			if(snum>it.data) {
				snum=it.data;
			}
			it=it.next;
		}
		return snum;
	}

	/////////////////////////even number///////////////////////////	
	public void evenNumber() 
	{
		Node it=head;
		while(it != null)
		{
			if(it.data%2 == 0) {
				System.out.print(it.data + ", ");
			}
			it=it.next;
		}
		System.out.println();
	}

	/////////////////////////odd//////////////////////////////////	
	public void oddNumber() {
		Node it=head;
		while(it!=null) {
			if(it.data%2 != 0) {
				System.out.print(it.data + ", ");
			}
			it=it.next;
		}
		System.out.println();
	}


	public String toString() {
		String str = "";

		if(head == null)
		{
			str = "LL is empty..";
		}
		else
		{
			Node it = head;
			//while(it.next != null)  ==> this is without last node
			while(it != null)   //  ==> with last node
			{
				str += it.data + ", ";
				it = it.next;
			}
		}
		return str;
	}

}
