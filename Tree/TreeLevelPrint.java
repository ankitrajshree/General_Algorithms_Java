import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;
    public Node(int val){
        data = val;
        left = null;
        right = null;
    }
}
public class TreeLevelPrint {
    public static void printLevelNode(Node root){
        Node tempNode;
        Queue<Node> levelNodes = new LinkedList<Node>();
        if (root == null){
            return;
        }
        levelNodes.add(root);
        while(!levelNodes.isEmpty()){
            tempNode = levelNodes.poll();
            System.out.print(tempNode.data+" ");
            if( tempNode.left != null ){
                levelNodes.add(tempNode.left);
            }
            if(tempNode.right != null){
                levelNodes.add(tempNode.right);
            }
        }
    }

    public static void main( String args[] ){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.left = new Node(5);
        printLevelNode(root);
    }
}
