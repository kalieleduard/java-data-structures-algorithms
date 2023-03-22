package reverseLinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static void main(String[] args) {
        var solution = new Solution();
        var linkedList = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
        var result = solution.reverseList(linkedList);


    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        var res = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return res;
    }
}