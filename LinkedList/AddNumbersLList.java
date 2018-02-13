public class AddNumbersLList {
    static LinkListNode head1 , head2;
    static class LinkListNode{
        int data;
        LinkListNode next;
        public LinkListNode(int val){
            data = val;
            next = null;
        }
    }
    public static void addnode(int data, LinkListNode head){
        LinkListNode node = new LinkListNode(data);
        head.next = node;
        head = node;
        head.next = null;

    }

    public static void printLList(LinkListNode head){
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static LinkListNode sumLists(LinkListNode first,LinkListNode second) {
        LinkListNode finalLL = null;
        LinkListNode temp = null;
        LinkListNode trav = null;
        int carry = 0, sum = 0;
        while (first != null || second != null) {
            sum = carry + (finalLL != null ? finalLL.data : 0) + (second != null ? second.data : 0);
            carry = sum > 10 ? 1 : 0;
            sum = sum % 10;
            temp = new LinkListNode(sum);
            if (finalLL == null) {
                finalLL = temp;
            } else {
                trav.next = temp;
            }
            trav = temp;
            if (first != null) {
                first = first.next;
            }
            if (second != null) {
                second = second.next;
            }
        }
        if (carry > 0) {
            trav.next = new LinkListNode(carry);
        }
        return finalLL;
    }

    public static void main(String[] args) {
        AddNumbersLList list = new AddNumbersLList();

        // creating first list
        list.head1 = new LinkListNode(7);
        list.head1.next = new LinkListNode(5);
        list.head1.next.next = new LinkListNode(9);
        list.head1.next.next.next = new LinkListNode(4);
        list.head1.next.next.next.next = new LinkListNode(6);

        System.out.print("First List is ");
        list.printLList(head1);

        // creating seconnd list
        list.head2 = new LinkListNode(8);
        list.head2.next= new LinkListNode(4);
        System.out.print("Second List is ");
        list.printLList(head2);

        // add the two lists and see the result
        LinkListNode rs = list.sumLists(head1, head2);
        System.out.print("Resultant List is ");
        list.printLList(rs);
    }
}
