public class stack{

 private int [] iStack;
 private int currentPos = -1;

/*
 * Constructor: initializes the size
 * of the stack.
 */
public stack(int size){
	iStack= new int[size];
}

/*
 * push: pushes a number into the stack
 */
public void push(int number){
	if((++currentPos) < iStack.length)
		iStack[currentPos] = number; 
	else
		System.out.println("There's no space in the stack");
}

/*
 * pop: takes the last number placed
 * in the stack.
 */
public int pop(){
	if(currentPos > -1)
		return iStack[currentPos--];
	else
		return -1;
}

/*
 * peek: returnst the last number
 * placed in the stack.
 */ 
public int peek(){
	if(currentPos > -1)
		return iStack[currentPos];
	else
		return -1;
}

	public static void main(String [] args){
		 stack newStack = new stack(1);

		 newStack.push(1);
		 System.out.println(newStack.peek());
		  // newStack.push(2);
		 System.out.println(newStack.pop());

	}
}

