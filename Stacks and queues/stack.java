
public class stack<T> {
	private Node <T>front;
	public stack (){
		front = null;
	}
	public void push (T data){
		front = new Node (data,front);
	}
	public Node pop (){
		if(front==null){
			return null;
		}
		Node temp = front;
		front = front.getNext();
		return temp;
	}
	public Node peek(){
		return front;
	}
	public boolean isEmpty(){
		return front==null;
	}
	public String toString(){
		Node temp = front;
		String list="";
		while(temp!=null){
			if (temp.getNext()==null){
				list += temp.getData();
			}
			else{
				list += temp.getData() + " --> ";
			}
			temp= temp.getNext();
		}
		return list;
	}
}