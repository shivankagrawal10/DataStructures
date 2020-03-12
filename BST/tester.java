import java.util.*;
public class tester{
	public static void main (String [] args){
		BST <Integer> tree  = new BST();
		ArrayList fir= new ArrayList();
		for (int i=0;i<10 ;i++ ) {
			tree.insert(50-i);
			tree.insert(i);
			tree.insert(i+10);
			tree.insert(i+90);
		}
		tree.inorder(tree.root);
		System.out.println("\n"+tree.keysInRange(tree.root,5,10,fir));
		//tree.reversekeys(tree.root);
		//tree.inorder(tree.root);
		System.out.print(tree.kthLargest(tree.root,4));
	}
}