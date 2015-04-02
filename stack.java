import java.util.*;
public class stack{

 private int [] iStack;
 private int currentPos = -1;
 private HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();

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
	if((++currentPos) < iStack.length){
		iStack[currentPos] = number;
		//put in a hashmap for mode.
		if(map.get(iStack[currentPos])!= null)
			map.put(iStack[currentPos], map.get(iStack[currentPos])+1);
		else
			map.put(iStack[currentPos],1);
	}
	else
		System.out.println("There's no space in the stack");
}

/*
 * pop: takes the last number placed
 * in the stack.
 */
public int pop(){
	if(currentPos > -1){
		if((map.get(iStack[currentPos]) != null) || (map.get(iStack[currentPos]) > 0))
			map.put(iStack[currentPos],map.get(iStack[currentPos]-1));
		return iStack[currentPos--];
	}
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
/*
 * mode: returns the most repeated number,
 * if two numbers have the max value, it 
 * it retursn the the latest number being
 * pushed to the stack.
 */
public int mode(){
	int max=0,val=0,index=0;
	if(currentPos > 0)
	for(int i=0;i<=currentPos; i++){
		val=map.get(iStack[i]);
		if(val>max){
			max=val;
			index =i;
		}
	}
	return iStack[index];
}



	public static void main(String [] args){
		 stack newStack = new stack(10);

		 newStack.push(1);
		 newStack.push(5);
		 newStack.push(8);
		 newStack.push(3);
		 newStack.push(2);
		 newStack.push(3);
		 newStack.push(1);
		 
		 // System.out.println(newStack.peek());
		  // newStack.push(2);
		 // System.out.println(newStack.pop());
		 System.out.println(newStack.mode());

	}
}

