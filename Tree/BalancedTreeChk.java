package tree;

public class BalancedTreeChk {
    node root;
    BalancedTreeChk(int val){
        root = new node(val);
    }
    public int getHeight(node root){
        int ht;
        if (root == null ){
            return 0;
        }else{
            ht = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
        }
        return ht;

    }
    public boolean isBalancedTree(node root){
        int leftheight , rightheight, htDiff;
        if (root == null){
            return true;
        }else{
            leftheight = getHeight(root.left);
            rightheight = getHeight(root.right);
            htDiff = Math.abs(leftheight-rightheight);
            return ( (htDiff == 1) || (htDiff == 0));
        }
    }
    public static void main(String args[]){
        BalancedTreeChk btc = new BalancedTreeChk(8);
        btc.root.left = new node(6);
        //btc.root.right = new node(10);
        btc.root.left.left = new node(4);
        btc.root.left.right = new node(7);
        //btc.root.right.left = new node(9);
        //btc.root.right.right = new node(11);
        System.out.println("Tree is balanced : "+btc.isBalancedTree(btc.root));
    }
}
