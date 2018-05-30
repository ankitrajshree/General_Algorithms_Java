package tree;

public class SumAllNodeBTree {
    public double getSum(int levels){
        int noOfLeafs;
        double sum;
        noOfLeafs = (int)Math.pow(2,levels-1);
        sum = ((noOfLeafs*(noOfLeafs+1))/2)*levels;
        return sum;
    }
    public static void main( String args[]){
        SumAllNodeBTree sbtree = new SumAllNodeBTree();
        System.out.println("Sum of perfect binary tree : "+sbtree.getSum(2));
    }
}
