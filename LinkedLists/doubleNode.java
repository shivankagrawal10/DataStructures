
	public class doubleNode<T> {
		public T data;

		public doubleNode next, prev;

		public doubleNode (T data, doubleNode prev, doubleNode next){
			this.data = data;
			this.next = next;
			this.prev=prev;
		}

		public void setprev (doubleNode prev){
			this.prev= prev;
		}
		public String toString(){
			return data+"";
		}
	}