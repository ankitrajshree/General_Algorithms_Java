package tree;

public class RootToLeafEqualNum {
    node root;
    public RootToLeafEqualNum(int val){
        root = new node(val);
    }
    public boolean isRootToLeafSum(node root,int num){
        boolean isSum = false;
        //Base case exit of recursion
        if (root == null){
            isSum = (num == 0);
        //If root is the leaf element or the tree has only root element
        }else if (root.left == null && root.right == null && root.value == num){
            isSum = true;
        }else{
            int newNum  = num - root.value;
            if ( root.left != null ){
                isSum = isSum || isRootToLeafSum(root.left,newNum);
            }
            if ( root.right != null ){
                isSum = isSum || isRootToLeafSum(root.right ,newNum );
            }
        }
        return isSum;
    }
    public static void main( String args[] ){
        RootToLeafEqualNum rtl = new RootToLeafEqualNum(1);
        rtl.root.left = new node(2);
        rtl.root.right = new node(3);
        rtl.root.left.left = new node(4);
        rtl.root.left.right = new node(5);
        rtl.root.right.left = new node(6);
        rtl.root.right.right = new node(7);
        rtl.root.left.left.left = new node(8);
        rtl.root.right.right.right = new node(9);
        if(rtl.isRootToLeafSum(rtl.root, 8))
            System.out.println("Sum path exist");
        else
            System.out.println("Sum path does not exist");
    }
}
