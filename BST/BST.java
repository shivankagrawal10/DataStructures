import java.util.*;
public class BST<T extends Comparable <T>>{
	BSTNode <T> root;
	private int size=0;
	public BST(){
		root = null;
		size=0;
	}
	public void insert (T item) throws IllegalArgumentException{
		BSTNode ptr = root , prev = null , temp = new BSTNode(item,null,null);
		int c = 0;
		while(ptr!=null){
			c=item.compareTo((T)ptr.data);
			if (c==0){throw new IllegalArgumentException("Duplicate Key");}
			prev = ptr;
			ptr = c<0 ? ptr.left : ptr.right;
			if(ptr==prev.right&&ptr!=null){prev.rightsize+=1;}
			else if (ptr==prev.left&&ptr!=null) {prev.leftsize+=1;}
			// same as saying if (c<0){ptr= ptr.left;} else{ptr=ptr.right;}
		}
		if (prev==null){root = temp;return;}
		if (c<0) { prev.left=temp;prev.leftsize+=1;}
		else{prev.right=temp;prev.rightsize+=1;}
		size++;	
		}
	public void recurinsert(T item,BSTNode<T> ptr, BSTNode<T> prev)throws IllegalArgumentException{
		if (ptr==null){
			if(prev==null){root=new BSTNode(item, null,null);return;}
			if ((item).compareTo(prev.data)<0){
				prev.left = new BSTNode(item, null,null);
			}
			else{
				prev.right = new BSTNode(item, null,null);
			}
			return;
		}
		if ((ptr.data).compareTo(item)==0){
			throw new IllegalArgumentException("bruh");
		}
		else if ((item).compareTo(ptr.data)<0){
			prev= ptr;
			ptr=ptr.left;
		}
		else{
			prev=ptr;
			ptr=ptr.right;
		}
		recurinsert(item,ptr,prev);
	}
	public T kthLargest(BSTNode<T> root, int k) throws NoSuchElementException {
		System.out.print(root+" "+root.rightsize+" \n");
		if (root==null){return null;}
		if (k>(root.rightsize)+1){ throw new NoSuchElementException("not here");}
		if((root.rightsize)+1==k){return root.data;}
		return kthLargest(root.right,k);
	}
	public  int keysInRange(BSTNode<T>root, T min, T max, ArrayList<T> result) {
		if(root ==null){return 0;}
		if((min).compareTo(root.data)<=0 && (max).compareTo(root.data)>=0){
			result.add(root.data);
			return keysInRange(root.left,min,max,result)+1+keysInRange(root.right,min,max,result);
		}
		else if ((max).compareTo(root.data)<0){return keysInRange(root.left,min,max,result);}
		else{return keysInRange(root.right,min,max,result);}
		//return counter;
	}
	public void reversekeys(BSTNode<T> temp){
		if (temp ==null){return;}
		reversekeys(temp.left);
		reversekeys(temp.right);
		BSTNode <T> tl = temp.left;
		temp.left = temp.right;
		temp.right = tl;
	}
	public T search (T item){
		BSTNode<T> ptr = root;
		while (ptr!=null){
			if (ptr.data==item){return ptr.data;}
			else if ((ptr.data).compareTo(item)>0){ ptr = ptr.left;}
			else { ptr = ptr.right;}
		}
		return null;
	}
	public void inorder(BSTNode<T> node){
		if (node==null){return;}
		//System.out.print(node+" ");
		inorder(node.left);
		System.out.print(node+" ");//inorder
		inorder(node.right);
		//System.out.print(node+" ");

	}
}