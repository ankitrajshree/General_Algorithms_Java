package tree;

public class TreeSize {
    public node root;
    public TreeSize(int val){
        root = new node(val);
    }
    public int getSize(node root){
        int size = 0;
        if (root == null){
            return 0;
        }else{
            size = getSize(root.left) + getSize(root.right) + 1;
        }
        return size;
    }
    public static void main(String args[]){
        TreeSize ts = new TreeSize(8);
        ts.root.left = new node(6);
        ts.root.right = new node(10);
        ts.root.left.left = new node(4);
        ts.root.left.right = new node(7);
        ts.root.right.left = new node(9);
        ts.root.right.right = new node(11);
        int res = ts.getSize(ts.root);
        System.out.println("Size of tree is : "+res);
    }
}
