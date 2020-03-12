public class queues<T> {
	private Node <T>front, end;
	public queues (){
		front = null;
		end=null;
	}
	public void enqueue (T data){ //add to the back
		
		if(end==null){
			end = new Node (data,end);
			end.setNext(end);
			front = end;
		}
		else{
			end.setNext(new Node(data,front));
			end = end.getNext();
		}
	}
	public Node dequeue (){
		if(front==null){
			return null;
		}
		Node temp = front;
		if(front==front.getNext()){
			front =null;
			return temp;
		}
		front = front.getNext();
		end.setNext(front);
		return temp;
	}
	public String toString(){
		Node temp = front;
		String list="";
		do{
			if(temp==null){
				return "empty";
			}
			if (temp.getNext()==front){
				list += temp.getData();
			}
			else{
				list += temp.getData() + " --> ";
			}
			temp= temp.getNext();
		}while(temp!=front);
		return list;
	}
}