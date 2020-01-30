
public class LinkedList<Type>{
	private Node list=null;
	private Node temppointer=list;
	//	temp = new Node(2,temp); // next pointer refers to the next node in line
	//	temp = new Node(1,temp); // Node with next pointer = null is last element
	public LinkedList(){

	}
	public Node first(){
		return list;
	}
	public Node next(){
		temppointer=temppointer.next; //in future add something to handle when reaches null
		return temppointer;
	}
	public void refreshtemp(){ temppointer = list;}
	public void addtofront(Type data){
		list = new Node (data, list);
	}
	public void addpos (Type newdata, Node where){
		where.next = new Node(newdata, where.next);
	}
	public void add (Type where, Type newdata){
		Node temp = list;
		while(temp!=null){
			if (temp.data==where){break;}
			temp=temp.next;
		}
		temp.next = new Node (newdata,temp.next);
	}
	public void removepos (Node wnext){
		Node old = wnext.next;
		wnext.next = old.next;
	}
	public void remove (Type where){
		Node temp = list, prev = null;
		if (temp==null){
			return;
		}
		while(temp!=null){
			if(temp.data ==where){
				break;
			}
			prev=temp;
			temp=temp.next;
		}
		if(prev==null){ //handles front of list
			list=temp.next;
		}
		else{
			prev.next=temp.next;
		}
	}
	public void removeall (Type where){
		Node temp = list, prev = null;
		if (temp==null){
			return;
		}
		while(temp!=null){
			if(temp.data ==where){
				if(prev==null){ //handles front of list
					list=temp.next;
				}
				else{
					prev.next=temp.next;
				}
				temp=temp.next;
			}
			else{
				prev=temp;
				temp=temp.next;
			}
		}
		
	}
	public int size(){ return sizehelp(list);} //Using helper class so that user interface is simple 
	public int sizehelp(Node list){
		int counter=0;
		while(list!=null){
			counter++;
			list = list.next;
		}
		return counter;
	}
	public LinkedList copy(){
		LinkedList<Type> store = new LinkedList<Type>();
		reverse();
		Node temp = list;
		while(temp!=null){
			//System.out.println((Type)temp.data);
			store.addtofront((Type)temp.data);
			temp = temp.next;
		}
		reverse();
		return store;
	}
	public void reverse(){ reversehelp(list);}
	public void reversehelp(Node list){
		Node oldfront = this.list;
		Node store = list; //stores the current node
		if (list.next==null){ //checks if next node is null
			this.list = list; //setting the front of list pointer to end of list bc end is now the new front
			return;
		}
		list = list.next; //stores next node under list name
		reversehelp(list); //recursive statement on next node -- goes all the way down the list until hits null
		//System.out.println(store+" rev: "+list+" rev.next: "+list.next);
		list.next = store; //making the next pointer point to previous node
		store.next= null; //default sets every next attribute to null, if there is something after the backtracing of recursion will continue otherwise that marks the end of the list		
	}

	public void convert2CLL (){
		Node temp = list;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = list;
	}
	public Node node(){
		return temppointer;
	}
	public boolean isPalindrome (){
		LinkedList<Type> rev = copy();
		reverse();
		Node iter = list;
		rev.refreshtemp();
		//System.out.print(rev.node());
		//rev.recurprint();
		while(iter!=null){
			if (((Type)(iter.data)).equals((Type)(rev.node()).data)){
				//System.out.print( iter+", "+rev.node());
				iter = iter.next;
				rev.next();
				continue;
			}
			reverse();
			return false;
		}
		reverse();
		return true;
	}
	public void printlist(){
		Node first = list;
		while(first!=null){
			System.out.println(first);
			first = first.next;
		}	
	}
	public void recurprint (){ prin(list);}
	public void prin(Node list){
		if (list==null){
			return;
		}
		System.out.println(list);
		prin(list.next);
	}
}
