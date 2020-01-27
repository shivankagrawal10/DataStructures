
	public class DLL<Type> {

		private doubleNode list=null;
		public void add (Type newdata, doubleNode where){
			doubleNode nadd = new doubleNode(newdata, where, where.next);
			where.next.prev = nadd;
			nadd.prev = where;
			where.next = nadd;
		}
		public void addtofront(Type data){
			doubleNode temp = new doubleNode (data, null,list);
			if (list!=null){
			list.setprev(temp);}
			list= temp;
		}
		public void recurprint (){ prin(list);}
		public void prin(doubleNode list){
			if (list==null){
				System.out.println(list);
				return;
			}
			System.out.println(list);
			prin(list.next);
			System.out.println(list.prev);
		}
	}