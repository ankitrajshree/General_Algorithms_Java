package tree;

public class MorrisTraversal {
    public node root;
    public MorrisTraversal(int val){
        root = new node(val);
    }
    public void inOrderTrav(){
        node curNode;
        if ( root == null ){
            return;
        }
        curNode = root;
        while ( curNode != null ){
            if ( curNode.left == null ){
                //Nothing to find on left of tree so print root and go right
                System.out.print(curNode.value+" ");
                curNode = curNode.right;
            }else{
                //Go to left child and find the predecessor
                node predecessor = curNode.left;
                while ( predecessor.right != curNode && predecessor.right != null ){
                    predecessor = predecessor.right;
                }
                //Creating link between root and inorder predecessor
                if (predecessor.right == null){
                    predecessor.right = curNode;
                    curNode = curNode.left;
                }else {
                    //The node has been visited break the link and move to right
                    predecessor.right = null;
                    System.out.print(curNode.value+" ");
                    curNode = curNode.right;
                }
            }
        }
        System.out.println();
    }

    //Only the print position changes
    public void preOrderTrav(){
        node curNode;
        if ( root == null ){
            return;
        }
        curNode = root;
        while ( curNode != null ){
            if ( curNode.left == null ){
                //Nothing to find on left of tree so print root and go right
                System.out.print(curNode.value+" ");
                curNode = curNode.right;
            }else{
                //Go to left child and find the predecessor
                node predecessor = curNode.left;
                while ( predecessor.right != curNode && predecessor.right != null ){
                    predecessor = predecessor.right;
                }
                //Creating link between root and inorder predecessor
                if (predecessor.right == null){
                    predecessor.right = curNode;
                    System.out.print(curNode.value+ " ");
                    curNode = curNode.left;
                }else {
                    //The node has been visited break the link and move to right
                    predecessor.right = null;
                    curNode = curNode.right;
                }

            }
        }
    }

    public static void main(String args[]){
        MorrisTraversal mt = new MorrisTraversal(8);
        mt.root.left = new node(6);
        mt.root.right = new node(10);
        mt.root.left.left = new node(4);
        mt.root.left.right = new node(7);
        mt.root.right.left = new node(9);
        mt.root.right.right = new node(11);
        mt.inOrderTrav();
        mt.preOrderTrav();
    }
}
