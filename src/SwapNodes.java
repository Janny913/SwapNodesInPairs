import java.util.List;

/**
 * Created by jianiyang on 16/7/21.
 */
public class SwapNodes {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }

    }

    public ListNode swapPairs(ListNode head){
        if((head == null) || (head.next == null))
            return head;

        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
    }

    public  static ListNode list1(){
        ListNode l5 = new ListNode(5, null);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        return l1;
    }

    public static void main(String[] args){
        SwapNodes res = new SwapNodes();
        ListNode out = res.swapPairs(list1());
        while(out.next!= null){
            System.out.print(out.val + "->");
            out = out.next;
        }
        System.out.println(out.val);
    }
}
