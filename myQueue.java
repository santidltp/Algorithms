public class myQueue{

	int [] iQueue ;
	int last =-1;
	int first=-1;

/*
 * Constructor: initializes the
 * array by providing the size of
 * of the stack.
 */
public myQueue(int size){
	iQueue= new int[size];
}

/*
 * enque: method to populate the
 * the queue.
 */
public void enqueue(int number){
	if( last < 100){
		iQueue[++last]=number;
	}
	else{
		System.out.println("Sorry your queue is full");
	}
}

/*
 * dequeue: method that takes the first 
 * elements out of the queue.
 */
public int dequeue(){
	if(last>-1 && first < last){
		return iQueue[++first];
	}
	else{
		System.out.println("There is nothing to delete");
		first = last = -1;
		return -1;
	}
}

	public static void main(String[] args){
		 myQueue thiQ = new myQueue(5);
		 thiQ.enqueue(1);
		 thiQ.enqueue(3);
		 System.out.println(thiQ.dequeue());
		 System.out.println(thiQ.dequeue());
		 System.out.println(thiQ.dequeue());
	}
}