package tree;
class height{
    int ht;
}
public class TreeDiameter {
    public node root;
    public TreeDiameter(int val){
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

    public int getDiameterOptimal(node root,height ht){
        height leftHt = new height();
        height rightHt = new height();
        int leftDia,rightDia;
        if (root == null ){
            ht.ht = 0;
            return 0;
        }
        leftDia = getDiameterOptimal(root.left,leftHt);
        rightDia = getDiameterOptimal(root.right,rightHt);
        ht.ht = Math.max(leftHt.ht,rightHt.ht) + 1;
        return Math.max((leftHt.ht+rightHt.ht+1),Math.max(leftDia,rightDia));
    }

    public int getDiameter(node root){
        int diameter;
        int leftHt=0,rightHt=0,leftDia=0,rightDia=0;

        if (root == null ){
            diameter = 0;
            return 0;
        }
        leftHt = getHeight(root.left);
        rightHt = getHeight(root.right);
        leftDia = getDiameter(root.left);
        rightDia = getDiameter(root.right);
        diameter = Math.max((leftHt+rightHt+1),Math.max(leftDia,rightDia));
        return diameter;
    }

    public static void main(String args[]){
        TreeDiameter td = new TreeDiameter(8);
        td.root.left = new node(6);
        td.root.right = new node(10);
        td.root.left.left = new node(4);
        td.root.left.right = new node(7);
        //td.root.right.left = new node(9);
        //td.root.right.right = new node(11);
        height ht = new height();
        int res = td.getDiameterOptimal(td.root,ht);
        System.out.println("Size of tree is : "+res);
    }

}
