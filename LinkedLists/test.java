

public class test{

	public static void main(String[] args) {
		LinkedList <Integer> temp = new LinkedList<Integer>();
		//DLL <Integer> temp = new DLL<Integer>();		
		for (int i=1;i<=10;i++){
			temp.addtofront(i);
		}
		temp.add(9,8);
		temp.printlist();
		temp.removeall(8);
		temp.printlist();

		/*
		System.out.println(temp.size());
		LinkedList <Integer> temp1 = temp.copy();
		temp.printlist();
		temp1.printlist();
		//temp.reverse();
		//temp.convert2CLL();
		System.out.println(temp.isPalindrome());
		//temp.recurprint();
		*/
	}
}
	/*
	public static IntNode addtofront(int data, IntNode oldfront){
		return new IntNode (data, oldfront);
	}
	public static void addNode (int newdata, IntNode where){
		IntNode nadd = new IntNode(newdata, where.next);
		where.next = nadd;
	}
	public static void delNode (IntNode wnext){
		IntNode old = wnext.next;
		wnext.next = old.next;
	}
	public static int size(IntNode counting){
		int counter=0;
		while(counting!=null){
			counter++;
			counting = counting.next;
		}
		return counter;
	}
	public static void reverse(IntNode rev){
		if (rev.next==null){
			return;
		}
		IntNode store = rev;
		rev = rev.next;
		reverse(rev);
		System.out.println(store+" rev: "+rev+" rev.next: "+rev.next);
		rev.next = store;
		
	}
	public static void printlist(IntNode first){
		while(first!=null){
			System.out.println(first);
			first = first.next;
		}	
	}
	public static void recurprint (IntNode first){
		if (first==null){
			return;
		}
		System.out.println(first);
		recurprint(first.next);
	}
}
*/