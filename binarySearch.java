
public class binarySearch{


	public static int binarySearch(int[] array, int key, int min, int max){
		if(min>max)
			return -1;
		else{
			int i=(min+max)/2;
			int midPoint = array[i];
			if(key<midPoint)
				return binarySearch(array,key,min,i-1);
			else if(key>midPoint)
				return binarySearch(array,key,i+1,max);
			else 
				return i;
		}
	}

	public static void main(String [] args){
		int [] array={1,2,3,4,5,6,7,8,9,25,36,45,52,78,98,100};
		System.out.println(binarySearch(array, 36,0,array.length-1));
	}
}