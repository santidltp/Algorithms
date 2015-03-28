
public class binaryTree{

	Node root;

	public void addNode(int num){
		Node newNode = new Node(num);

		if(root == null){
			root = newNode;
		}
		else{
			Node currentNode = root;
			Node parentNode;
			while(true){
				parentNode = currentNode;
				if(num<currentNode.number){
					currentNode = currentNode.left;
					if(currentNode==null){
						parentNode.left = newNode;
						return;
					}
				}
				else{
					currentNode = currentNode.right;
					if(currentNode ==null){
						parentNode.right = newNode;
						return;
					}
				}

			}
		}

	}
	public void arrayToTree(int [] a, int start, int end){
		
		if(end < start)return;
		else{
			int  mid = (start+end)/2;

			System.out.println(a[mid]);
			addNode(a[mid]);
			arrayToTree(a,start,mid-1);
			arrayToTree(a,mid+1,end);
		}
	}
	/*
	 * In order Traverse will print left node, right node 
	 * and right node. 
	 */
	public void inOderTraverseTree(Node currentNode){
		if(currentNode != null){
			inOderTraverseTree(currentNode.left);
			System.out.println(currentNode.number);
			inOderTraverseTree(currentNode.right);
		}
	}
	
	/*
	 *
	 */
	public void preOrderTraverseTree(Node currentNode){
		if(currentNode != null){
			System.out.println(currentNode.number);
			preOrderTraverseTree(currentNode.left);
			preOrderTraverseTree(currentNode.right);
		}
	}
	public void postOrderTrasverseTree(Node currentNode){
		if(currentNode != null){
			postOrderTrasverseTree(currentNode.left);
			postOrderTrasverseTree(currentNode.right);
			System.out.println(currentNode.number);

		}
	}
	public static void main(String[] args){
		binaryTree tree = new binaryTree();
		/*tree.addNode(0);
		tree.addNode(3);
		tree.addNode(4);
		tree.addNode(5);
		tree.addNode(1);
		tree.addNode(2);*/
		int [] a ={1,2,3,4,5,6,7,8,9};

		tree.arrayToTree(a,0,a.length-1);
		
		System.out.println("inOrderTrasverseTree");
		tree.inOderTraverseTree(tree.root);

		System.out.println("preOrderTraverseTree");
		tree.preOrderTraverseTree(tree.root);


	}

}

// The following class
// is the class node that
// contains the satellite
// data from the BST.
class Node{

	int number; 
	Node left; //left Node
	Node right; //right Node
	
	//constructor
	Node(int num){
		this.number=num;
	}
}