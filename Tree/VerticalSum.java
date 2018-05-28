package tree;

import java.util.HashMap;
import java.util.Map;

public class VerticalSum {
    public node root;
    public VerticalSum(int val){
        root = new node(val);
    }
    public void getVerticalSum(node root){
        Map vertSumMap = new HashMap();
        if (root == null){
            return;
        }
        //Calling util to update the HashMap to store the vertical sum
        getVerticalSumUtil(vertSumMap,0,root);
        System.out.println(vertSumMap.entrySet());
    }
    public void getVerticalSumUtil( Map sumMap,int nodedist, node root ){
        if ( root == null ){
            return;
        }
        if ( !sumMap.containsKey(nodedist)){
            sumMap.put(nodedist,root.value);
        }else{
            sumMap.put(nodedist,(int)sumMap.get(nodedist) + root.value);
        }
        getVerticalSumUtil(sumMap,nodedist-1,root.left);
        getVerticalSumUtil(sumMap,nodedist+1,root.right);
    }
    public static void main(String args[]){
        VerticalSum vs = new VerticalSum(8);
        vs.root.left = new node(6);
        vs.root.right = new node(10);
        vs.root.left.left = new node(4);
        vs.root.left.right = new node(7);
        vs.root.right.left = new node(9);
        vs.root.right.right = new node(11);
        vs.getVerticalSum(vs.root);
    }
}
