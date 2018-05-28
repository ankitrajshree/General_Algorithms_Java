package tree;

import java.util.Stack;

public class InOrderWoutRecursion {
    public node root;
    public InOrderWoutRecursion(int val){
        root = new node(val);
    }
    public void inOrderTrav(){
        node curNode;
        if ( root == null ){
            return;
        }
        Stack<node> stck = new Stack<node>();
        stck.push(root);
        curNode = root;
        while( curNode.left != null){
            stck.push(curNode.left);
            curNode = curNode.left;
        }
        while ( !stck.empty() ){
            curNode = stck.pop();
            System.out.print(curNode.value+" ");
            if (curNode.right != null){
                curNode = curNode.right;
                while ( curNode != null ){
                    stck.push(curNode);
                    curNode = curNode.left;
                }
            }

        }

    }
    public static void main(String args[]){
        InOrderWoutRecursion iowr = new InOrderWoutRecursion(8);
        iowr.root.left = new node(6);
        iowr.root.right = new node(10);
        iowr.root.left.left = new node(4);
        iowr.root.left.right = new node(7);
        iowr.root.right.left = new node(9);
        iowr.root.right.right = new node(11);
        height ht = new height();
        iowr.inOrderTrav();
    }
}
