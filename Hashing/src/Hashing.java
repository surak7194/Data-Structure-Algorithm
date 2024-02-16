import java.util.Arrays;

public class Hashing{

	String []array;  //reference

	public Hashing(int size)  //constructor
	{
		array = new String[size]; ///8 
	}

	public void insertL(String str) { //arj
		int idx=0;

		for(int i=0;i<str.length();i++) {
			idx=idx+str.charAt(i);  //114//211//317
		}

		int key=idx%array.length;  //5

		if(array[key]==null) {
			array[key]=str;
		}
		else {
			//collision linear
			int count = 0;

			while(true) 
			{  //arj
				if(key < array.length-1) 
				{ //5 < 7 
					key++;  //6
				}
				else 
				{
					key=0;
				}
				if(array[key]==null) 
				{
					array[key]=str;
					break;
				}
				count++;
				if(count==array.length)
				{
					break;
				}
			}
		}



	}

	public String toString() {
		String str="";
		for(int i=0;i<array.length;i++) {
			str=str+array[i]+", ";
		}
		return str;
	}
}