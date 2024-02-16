
public class LinkList {

	private Node head;
	
	public LinkList() {
		this.head = null;
	}
	
	public void insert(String data)
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
	
	public void append(String data)
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
 
	private int getLLLength()
	{
		//Find length of LL
		int noOFNodes = 0;
		Node it = head;
		while(it != null)
		{
			noOFNodes++;
			it= it.next;
		}
		return noOFNodes;
	}
	
	public void insertByPos(String value, int pos)
	{
		int noOFNodes = getLLLength();
		
		if(pos == 1)
		{
			insert(value);
		}
		else if(pos == noOFNodes+1)
		{
			append(value);
		}
		else if(pos > 1 && pos < noOFNodes+1)
		{
			//we are sure.. inserting in middle
			Node tmp = new Node(value);
			
			Node it = head;
			for(int i=1; i<pos-1; i++)
			{
				it = it.next;
			}
			
			tmp.next = it.next;
			it.next = tmp;
		}
		else
		{
			System.out.println("Invalid Position..");
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
			}
			else
			{
				//More than 1 node..
				Node t = head;
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
				Node t = head;
				while(t.next.next != null)
					t = t.next;
				
				t.next = null;
			}
		}
	}
	
	public void deleteByPos(int pos)
	{
		int noOFNodes = getLLLength();
		
		if(pos == 1)
		{
			deleteFirst();
		}
		else if(pos == noOFNodes)
		{
			deleteLast();
		}
		else if(pos > 1 && pos < noOFNodes)
		{
			Node it = head;
			for(int i=1; i<pos-1; i++)
			{
				it = it.next;
			}
			
			Node t = it.next;
			it.next = t.next;
			t.next = null;
		}
		else
		{
			System.out.println("Invalid Position..");
		}
	}
	
	public void reverse()
	{
		Node it = head;
		Node itp = null;
		Node itn = head;
		
		while(it != null)
		{
			itn = it.next;
			it.next = itp;
			itp = it;
			it = itn;
		}
		head = itp;
	}
	
	public void reversePrint()
	{
		reversePrintRec(head);
		System.out.println();
	}
	
	private void reversePrintRec(Node it)
	{
		if(it.next != null)
			reversePrintRec(it.next);
		
		System.out.print(it + ", ");
	}
	
	@Override
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
				str += it + ", ";
				it = it.next;
			}
		}
		return str;
	}

	public int deleteValue(String inputStr) {
		
		int retValue = 0;
		if(head != null)
		{
			int count = 1;
			Node it = head;
			
			while(it != null)
			{
				if(it.data.equals(inputStr))
				{
					deleteByPos(count);
					retValue=1;
					break;
				}
				count++;
				it = it.next;
			}
		}
		return retValue;
		
	}

	public boolean isPresent(String inputStr) {
		
		if(head != null)
		{
			Node it = head;
			while(it != null)
			{
				if(it.data.equals(inputStr))
					return true;
				
				it = it.next;
			}
		}
		return false;
	}
	
}
