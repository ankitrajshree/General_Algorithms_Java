package tree;

class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode(int val){
        this.value = val;
        this.left = null;
        this.right = null;
    }
}
public class TreeSame {
    public boolean isSame(TreeNode root1, TreeNode root2){
        if (root1 == null && root2 == null){
            return true;
        }
        if ( root1 != null && root2 != null){
            return (root1.value == root2.value) && (isSame(root1.left,root2.left)) && (isSame(root1.right,root2.right));
        }
        return false;
    }
    public static void main(String args[]){
        TreeNode ts1 = new TreeNode(8);
        ts1.left = new TreeNode(6);
        ts1.right = new TreeNode(10);
        TreeNode ts2 = new TreeNode(8);
        ts2.left = new TreeNode(6);
        ts2.right = new TreeNode(11);
        TreeSame tsObj = new TreeSame();
        System.out.println(tsObj.isSame(ts1,ts2));
    }
}
