import java.util.Scanner;

class Node{
	int val = 0 ;
	Node left ,right;
	public Node(int value){
		val = value;
		left = null;
		right = null;
	}
}

public class BinarySearchTree {
	Node root;
	public BinarySearchTree(){
		root = null;
	}
	public void inOrderTraversal(Node treeNode){
		if( treeNode == null ){
			return;
		}
		//Travel to the end of the left subtree
		inOrderTraversal(treeNode.left);
		//Print the left subtree leaf
		System.out.print(treeNode.val+" ");
		//Travel to the right subtree
		inOrderTraversal(treeNode.right);
	}
	public void preOrderTraversal(Node treeNode){
		if( treeNode == null ){
			return;
		}
		//Print the root element
		System.out.print(treeNode.val+" ");
		//Travel to the end of the left subtree
		inOrderTraversal(treeNode.left);
		//Travel to the right subtree
		inOrderTraversal(treeNode.right);
	}
	public void postOrderTraversal(Node treeNode){
		if( treeNode == null ){
			return;
		}
		//Travel to the end of the left subtree
		inOrderTraversal(treeNode.left);
		//Travel to the right subtree
		inOrderTraversal(treeNode.right);
		//Print the root of the subtree
		System.out.print(treeNode.val+" ");
	}
	public void addNode(Node root,Node element){
		try{
			Node temp = root;
			if ( temp.val >= element.val ){
				//Insert in left subtree
				if( temp.left != null ){
					addNode(temp.left,element);
				}else{
					temp.left = element;
				}
			}else{
				//Insert in right subtree
				if( temp.right != null ){
					addNode(temp.left,element);
				}else{
					temp.right = element;
				}
			}
		}catch(Exception exp){
			System.out.println("Exception :"+exp.getMessage());
		}
		
	}
	public static void main (String args[]){
		int totalNodes = 0 , i = 0 , nodeValue = 0, rootValue = 0;
		BinarySearchTree bst = new BinarySearchTree();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the nodes in the tree");
		totalNodes = in.nextInt();
		System.out.println("Enter the root of the tree");
		rootValue = in.nextInt();
		bst.root = new Node(rootValue);
		System.out.println("Root element is :"+bst.root.val);
		for( i = 0; i < totalNodes-1 ; i++){
			nodeValue = in.nextInt();
			Node n = new Node(nodeValue);
			bst.addNode(bst.root,n);
		}
		System.out.println("Inorder traversal : ");
		bst.inOrderTraversal(bst.root);
		System.out.println("\nPreOrder traversal : ");
		bst.preOrderTraversal(bst.root);
		System.out.println("\nPostOrder traversal : ");
		bst.postOrderTraversal(bst.root);
		in.close();
	}
	
}
