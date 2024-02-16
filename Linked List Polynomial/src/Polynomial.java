
public class Polynomial {

	PolyNode start;
	
	public void insert(float co,int ex){
		
		PolyNode new_node = new poltNode(co,ex);
		
		if((start==null)||(ex > start.expo))
		{
			new_node.next=start;
			start=new_node;
			return;
		}
		
	    PolyNode it = start;
	    while((it.next!=null && it.next.expo >= ex))
	    {
	    	it=it.next;
	    }
	}
	
	public static void main(String []args)
	{
		Polynomial poly1;
		poly1.insert(7,4);
		poly1.insert(7.5,5);
		poly1.insert(5.5,2);
		poly1.insert(3.5,8);
		poly1.insert(2.2,7);
	}
}
