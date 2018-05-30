package tree;

public class SumTree {
    node root;
    SumTree(int val){
        root = new node(val);
    }
    public int isLeafNode(node root){
        if ( root == null ){
            return 0;
        }
        if( root.left == null && root.right == null){
            return 1;
        }
        return 0;
    }
    public boolean isSumTree(node root){
        int leftSum, rightSum ;
        if ( root == null || isLeafNode(root) == 1 ){
            return true;
        }
        if ( isSumTree(root.left) && isSumTree(root.right)){
            if ( root.left == null){
                leftSum = 0;
            }else if(isLeafNode(root.left)!= 0){
                leftSum = root.left.value;
            }else{
                leftSum = 2 * (root.left.value);
            }
            if ( root.right == null){
                rightSum = 0;
            }else if(isLeafNode(root.right)!= 0){
                rightSum = root.right.value;
            }else{
                rightSum = 2 * (root.right.value);
            }
            return root.value == (leftSum+rightSum);
        }
        return false;
    }

    public static void main(String args[]){
        SumTree st = new SumTree(26);
        st.root.left = new node(10);
        st.root.right = new node(3);
        st.root.left.left = new node(5);
        st.root.left.right = new node(6);
        st.root.right.left = new node(3);
        System.out.println(st.isSumTree(st.root));
        //System.out.println("Size of tree is : "+res);
    }
}
