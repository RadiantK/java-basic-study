package ch04Stack;

//import ch02.MyArray;

public class MyArrayStack {
	
	MyArray arrayStack;
	int top;
	
	public MyArrayStack() {
		top = 0;
		arrayStack = new MyArray();
	}
	
	public MyArrayStack(int size) {
		top = 0;
		arrayStack = new MyArray(size);
	}
	
	public void push(int data) {
		
		if (isFull()) {
			System.out.println("stack is Full");
			return;			
		}
		arrayStack.addElement(data);
		top++;
	}
	
	public boolean isFull() {
		
		if(top == arrayStack.ARRAY_SIZE) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int pop() {
		
		if (isEmpty()) {
			return MyArray.ERROR_NUM;
		}
		return arrayStack.removeElement(--top);
	}
	
	public boolean isEmpty() {
		
		if (top == 0) {
			System.out.println("stack is empty");
			return true;
		}
		else {
			return false;
		}
	}
	
	public int peek() {
		
		if (isEmpty()) {
			return MyArray.ERROR_NUM;
		}
		return arrayStack.getElement(--top);
	}
	
	public void printAll() {
		arrayStack.printAll();
	}
	
}
