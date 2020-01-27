
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;

public class ExpenseList{
	LinkedList<Expense> expenses;

	public ExpenseList (){expenses = new Linkedlist <Expense>();}

	public void add(Expense exp){expenses.addtofront(exp);}

	public int size(){return expenses.size();}

	//public boolean isEmpty(){return expenses.isEmpty();}

	//public boolean contains(Expense exp){ return expenses.contains(exp);}

	//public void clear(){expenses.clear();}

	public void remove(Expense exp){ expenses.remove(exp);}

	public Expense first(){return expenses.first();}

	public Expense next(){return expenses.next();}

	public float[] minmaxavgExpense(float[] s){
		
		float min, max, sum, avg;
		float[] store = new float[3];
		min=expenses.first().getAmount();
		max=expenses.first().getAmount();
		sum+=expenses.first().getAmount();
		
		while(temp!=null){
			int store = expenses.next().getAmount();
			if(min>store){
				min = store;
			}
			if (max<store){
				max =store;
			}
			sum+=store;
		}
		avg = sum/size();
		s[0]=min;
		s[1]=max;
		s[2]=avg;
		return store; 
	}

	public float amountSpendOn(String expItem){
		return expItem.getAmount();}
	

	//public float amountSpendOnDuring(Calendar from, Calendar to){
		
	//}

	public Expense get(Expense getExp){return getExp.getAmount();}

}