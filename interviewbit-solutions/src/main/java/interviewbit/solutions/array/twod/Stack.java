package interviewbit.solutions.array.twod;

public class Stack {
	private Integer[] arr;
	private Integer top;
	private Integer size;
	
	public int peek() {
		return arr[top];
	}
	
	public Stack(int size){
		this.size=size;
		arr = new Integer[size];
		top=-1;
	}
	
	public Integer pop() {
		if(!isEmpty()) {
			Integer temp = arr[top];
			top--;
			return temp;
		}
		throw new IllegalStateException("Stack Empty");
	}
	
	public void push(int item){
		if (!isFull()) {
			top++;
			arr[top] = item;
			return;
		}
		throw new IllegalStateException("Stack Full");
	}

	public boolean isFull() {
		return top==size-1;
	}

	public boolean isEmpty() {
		return top==-1;
	}
}
