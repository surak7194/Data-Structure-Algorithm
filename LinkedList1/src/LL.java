
public class LL {
	
	Node head;
	
	LL()
	{
		head = null;
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
			it.next = tmp;
			
		}
	}
	
	public void print()
	{
		if(head == null)
			System.out.println("Empty");
		else
		{
			Node it = head;
			//while(it.next != null)
			while(it != null)
			{
				System.out.print(it.data + ", ");
				it = it.next;
			}
		}
	}
}
