//package tree;
//
//// Class to create a simple node of a tree
//class Node{
//    int value; //Value stored in node
//    Node left;
//    Node right;
//    Node(int value){
//        this.value = value;
//        right = null;
//        left = null;
//    }
//}
//
//public class SimpleTree {
//    public void addNode(Node root, int value){
//        if ( root == null ){
//            Node newNode = new Node(value);
//            return newNode;
//        }
//        if ( value < root.value){
//            addNode(root.left,value);
//        }else if(value > root.value){
//            addNode(root.right,value);
//        }else{
//            return root;
//        }
//        return root;
//    }
//    public static boolean findElem(Node node, int value){
//        if (node == null){
//            return false;
//        }
//        if (value == node.value){
//            return true;
//        }
//        return value > node.value ? findElem(node.right,value) : findElem(node.left,value);
//    }
//    public static void main(String args[]){
//        Node root = null;
//        rootNode = addNode(root, 6);
//        root = addNode(root,4);
//        root = addNode(root,8);
//        root = addNode(root,3);
//        root = addNode(root,)
//    }
//}
//
