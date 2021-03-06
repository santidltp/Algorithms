import java.util.*;

public class binaryTree{

	Node root;
	//add node to the tree
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

	/*
	 * arrayToTree is a method that takes an integer array
	 * and loads it into a Binary Search Tree, such that,
	 * the binary tree is perfectly balanced.
	 */
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

	/* Pre order Traverse will printn the parent node,
	 * the left node adn right node.
	 */
	public void preOrderTraverseTree(Node currentNode){
		if(currentNode != null){
			System.out.println(currentNode.number);
			preOrderTraverseTree(currentNode.left);
			preOrderTraverseTree(currentNode.right);
		}
	}

	/*
	 * Post Order Traverse prints left node, right node
	 * right node.
	 */
	public void postOrderTrasverseTree(Node currentNode){
		if(currentNode != null){
			postOrderTrasverseTree(currentNode.left);
			postOrderTrasverseTree(currentNode.right);
			System.out.println(currentNode.number);

		}
	}

	public void BreadthFirstSearch(Node currentNode){
		Queue<Node> queue = new LinkedList<Node>();
		Node temp = null;
		queue.add(currentNode);
		while(!queue.isEmpty()){
			temp = queue.poll();
			if(temp.left != null)
				queue.add(temp.left);
			if(temp.right != null)
				queue.add(temp.right);
			System.out.print(temp.number);
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
		
		// System.out.println("inOrderTrasverseTree");
		// tree.inOderTraverseTree(tree.root);

		// System.out.println("preOrderTraverseTree");
		// tree.preOrderTraverseTree(tree.root);

		System.out.println("check");
		System.out.println();
		tree.BreadthFirstSearch(tree.root);
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