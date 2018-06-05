package tree;

public class CountLeafs {
    node root;
    CountLeafs(int val){
        root = new node(val);
    }
    public int getLeafCount(node root){
        int leafs, leftleaf, rightleaf ;
        if (root == null){
            return 0;
        }else if (root.right == null && root.left == null){
            return 1;
        }else{
            leftleaf = getLeafCount(root.left);
            rightleaf = getLeafCount(root.right);
        }
        leafs = leftleaf+rightleaf;
        return leafs;
    }
    public static void main(String args[]){
        CountLeafs cntlvs = new CountLeafs(26);
        cntlvs.root.left = new node(10);
        cntlvs.root.right = new node(3);
        cntlvs.root.left.left = new node(5);
        cntlvs.root.left.right = new node(6);
        cntlvs.root.right.left = new node(3);
        System.out.println(cntlvs.getLeafCount(cntlvs.root));
        //System.out.println("Size of tree is : "+res);
    }
}
