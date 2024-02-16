public class Main {
	
	public static void main(String[] args) {
		
		BST bst = new BST();  //FC
		bst.insert(15);//root
		bst.insert(1); //
		bst.insert(3); //3
		bst.insert(2); //3
		bst.insert(4); //4
		bst.insert(6);
		bst.insert(-48);
		bst.insert(34);
		bst.insert(100);
		bst.insert(-8);
		bst.insert(95);
		bst.insert(7);
		
		
		
		
		bst.preOrder();
		bst.postOrder();
		bst.inOrder();
		
		bst.printLargestNumber();
		bst.printSmallestNumber();
        
		System.out.println("After Deletion Result:");
		bst.delete(1);
		bst.inOrder();
	}

}