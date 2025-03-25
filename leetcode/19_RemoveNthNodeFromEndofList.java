/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode leftPointer = head;
        ListNode rightPointer = head;

        while (n > 0 && rightPointer != null){
            rightPointer = rightPointer.next;
            n--;
        }

        while (rightPointer != null && rightPointer.next != null){

            rightPointer = rightPointer.next;
            leftPointer = leftPointer.next;
        }

        if (leftPointer == head && rightPointer == null){
            return head.next;
        }

        leftPointer.next = leftPointer.next.next;

        return head;
    }
}