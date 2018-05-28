package tree;

public class TreeHeight {
    public node root;
    public TreeHeight(int val){
        root = new node(val);
    }
    public int getHeight(node root){
        int ht = 0;
        if (root == null){
            return 0;
        }else{
            ht = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
        }
        return ht;
    }
    public static void main(String args[]){
        TreeHeight th = new TreeHeight(8);
        th.root.left = new node(6);
        th.root.right = new node(10);
        th.root.left.left = new node(4);
        th.root.left.right = new node(7);
        th.root.right.left = new node(9);
        th.root.right.right = new node(11);
        int res = th.getHeight(th.root);
        System.out.println("Size of tree is : "+res);
    }
}
