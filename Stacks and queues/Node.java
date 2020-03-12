
public class Node<T> {
	private T data;

	private Node next;

	public Node (T data, Node next){
		this.data = data;
		this.next = next;
	}
	public void setNext(Node next){
		this.next = next;
	}
	public Node getNext(){
		return next;
	}
	public T getData(){
		return data;
	}
	public String toString(){
		return data+"";
	}
}