import java.util.HashSet;

public class LinkedListLoopDetection {

    static LLNode head;

    static class LLNode{
        int data;
        LLNode next;
        public LLNode(int val){
            data = val;
            next = null;
        }
    }
    public static void addnode(int data){
        LLNode node = new LLNode(data);
        node.next = head;
        head = node;
    }
    public static boolean detectLoop(LLNode head){
        HashSet hset = new HashSet();
        LLNode temp = head;
        while ( temp.next != null ){
            if (hset.contains(temp.data)){
                return true;
            }
            hset.add(temp.data);
            temp = temp.next;
        }
        return false;
    }

    public static boolean floydDetectLoop(LLNode head){
        LLNode slowPtr , fastPtr;
        slowPtr = head ;
        fastPtr = head ;
        while( slowPtr != null && fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if ( slowPtr == fastPtr ){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        LinkedListLoopDetection llist = new LinkedListLoopDetection();

        llist.addnode(20);
        llist.addnode(4);
        llist.addnode(15);
        llist.addnode(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;

        if (floydDetectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");

    }
}
