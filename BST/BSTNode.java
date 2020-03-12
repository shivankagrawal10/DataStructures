public class BSTNode <T>{
	T data;
	BSTNode <T> left, right;
	int rightsize, leftsize;
	public BSTNode (T data, BSTNode left, BSTNode right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
	public String toString(){
		if (data==null){return "null";}
		return ""+data;
	}
}