package tree;

public class LevelOfNode {
    node root;
    LevelOfNode(int val){
        root = new node(val);
    }
    public int getLevelOfNode(node root,int curLevel,int val ){
        if ( root == null){
            return 0;
        }else if(root.value == val){
            return curLevel;
        }else{
            int downLevel = getLevelOfNode(root.left,curLevel+1,val);
            if ( downLevel > 0 ){
                return downLevel;
            }
            downLevel = getLevelOfNode(root.right,curLevel+1,val);
            return downLevel;
        }

    }
    public static void main(String args[]){
        LevelOfNode lon = new LevelOfNode(8);
        lon.root.left = new node(6);
        lon.root.right = new node(10);
        lon.root.left.left = new node(4);
        lon.root.left.right = new node(7);
        lon.root.right.left = new node(9);
        lon.root.right.right = new node(11);
        int res = lon.getLevelOfNode(lon.root,1,11);
        if (res > 0 ){
            System.out.println("Level of node :"+11+" is :"+res);
        }else{
            System.out.println("Node is not at any level");
        }
    }
}
