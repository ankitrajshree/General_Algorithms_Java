//A queue dequeue implementation
package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public node root;
    public LevelOrderTraversal(int val){
        root = new node(val);
    }
    public void levelOrder(node root){
        if ( root == null ){
            return;
        }
        Queue<node> nodeQ = new LinkedList<node>();
        nodeQ.add(root);
        while(!nodeQ.isEmpty()){
            node tmp = nodeQ.poll();
            System.out.println(tmp.value);
            if (tmp.left != null){
                nodeQ.add(tmp.left);
            }
            if (tmp.right != null){
                nodeQ.add(tmp.right);
            }
        }

    }

    public static void main(String args[]){
        LevelOrderTraversal lo = new LevelOrderTraversal(8);
        lo.root.left = new node(6);
        lo.root.right = new node(10);
        lo.root.left.left = new node(4);
        lo.root.left.right = new node(7);
        lo.root.right.left = new node(9);
        lo.root.right.right = new node(11);
        height ht = new height();
        lo.levelOrder(lo.root);
        //System.out.println("Size of tree is : "+res);
    }
}
