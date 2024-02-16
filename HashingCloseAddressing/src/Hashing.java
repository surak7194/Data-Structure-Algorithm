
public class Hashing {

	LinkList [] llArray;

	public Hashing(int size) {
		llArray = new LinkList[size];
		
		for (int i = 0; i < llArray.length; i++) {
			llArray[i] = new LinkList(); 
		}
	}

	public int hashFunction(String inputStr)
	{
		int sum = 0;
		for(int i=0; i<inputStr.length(); i++)
		{
			sum = sum + inputStr.charAt(i);
		}
		int index = sum % llArray.length;
		return index;
	}
	
	public void insert(String inputStr)
	{
		int index = hashFunction(inputStr);
		System.out.print(inputStr + " key from hashFunction = " + index);
		
		llArray[index].append(inputStr);
		
		System.out.println(" and it is placed at " + index);
	}
	
	public void remove(String inputStr)
	{
		int index = search(inputStr);
		int status = llArray[index].deleteValue(inputStr);
		if(status == 0)
			System.out.println(inputStr + ", not found");
		else
			System.out.println(" and it is removed from " + index);
	}
	
	private int search(String inputStr) {

		int index = hashFunction(inputStr);
		
		if( llArray[index].isPresent(inputStr) )
			System.out.print(inputStr + " key from hashFunction = " + index);
		else
			System.out.println(inputStr + ", not found");
		return index;
	}

	@Override
	public String toString() {
		String str = "";

		str = "{ ";
		for (int i = 0; i < llArray.length; i++) {
			str = str + llArray[i] + ", ";
		}
		str = str + " }";
		return str;
	}

}
