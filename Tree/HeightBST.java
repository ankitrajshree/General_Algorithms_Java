class TreeNode{
    int val;
    Node left,right;
    public TreeNode(int x){
        val = x;
        left = null;
        right = null;
    }
}

public class HeightBST {

    public static int getHeight(Node root){
        if (root == null) {
            return 0;
        }
        return ( 1 + Math.max(getHeight(root.left),getHeight(root.right)));
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.left = new Node(5);
        System.out.println("Height of the tree :"+getHeight(root));
    }
}
