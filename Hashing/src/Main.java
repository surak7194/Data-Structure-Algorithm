public class Main{
	
	public static void main(String []args)
	{
		Hashing hash = new Hashing(8);
		
		hash.insertL("jar");
		hash.insertL("arj");
		hash.insertL("jar");
		hash.insertL("jar");
		hash.insertL("jar");
		hash.insertL("jar");
		hash.insertL("jar");
		hash.insertL("jar");
		hash.insertL("jar");
		
		
		
		System.out.println(hash);
	}
}