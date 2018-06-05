package tree;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthofBT {
    node root;
    MaxWidthofBT(int val){
        root = new node(val);
    }
    public int getMaxWidth(node root){
        if (root == null){
            return 0;
        }
        int maxWidth = 0;
        int count = 0;
        Queue<node> levelQueue = new LinkedList<node>();
        levelQueue.add(root);
        while (!levelQueue.isEmpty()){
            count = levelQueue.size();
            maxWidth = Math.max(maxWidth,count);
            while (count > 0 ){
                node curNode = levelQueue.remove();
                if (curNode.left != null){
                    levelQueue.add(curNode.left);
                }
                if (curNode.right != null){
                    levelQueue.add(curNode.right);
                }
                count -= 1;
            }
        }
        return maxWidth;
    }
    public static void main(String args[]){
        MaxWidthofBT mwbt = new MaxWidthofBT(8);
        mwbt.root.left = new node(6);
        mwbt.root.right = new node(10);
        //mwbt.root.left.left = new node(4);
        mwbt.root.left.right = new node(7);
        //mwbt.root.right.left = new node(9);
        //mwbt.root.right.right = new node(11);
        System.out.println("Max width of tree is : "+mwbt.getMaxWidth(mwbt.root));
    }

}
