public class test{
	
	public static void main(String [] args){
		queues <Integer> temp  = new queues();
		for (int i =0;i<10;i++){
			temp.enqueue(i);
		}
		//System.out.print("done");
		System.out.println(temp);
		for (int i =0;i<10;i++){
			System.out.print(temp.dequeue()+" ");
			//System.out.print("done");
			System.out.println(temp);
		}
	}
}