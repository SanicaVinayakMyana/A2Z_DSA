package LinkedList;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val , ListNode next){
        this.val=val;
        this.next=next;
    }
}

class Solution{
    public ListNode middleNode(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
public class MiddleOfLL {
    public static void main(String[] args) {
        ListNode tempHead= new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(5,null))));
        Solution sol= new Solution();
        ListNode head= sol.middleNode(tempHead);
        System.out.println(head.val);
    }
}
