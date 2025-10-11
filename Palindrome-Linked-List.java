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
    
    public ListNode reverseList(ListNode head) {

        if(head == null) { return null; }

        ListNode current = head;
        ListNode next = head.next;
        ListNode temp = head.next;
        current.next = null;

        while(next != null) {
            temp = temp.next;
            next.next = current;
            current = next;
            next = temp;
        }

        return current;
    }

    static boolean isIdentical(ListNode list1, ListNode list2) {
        while (list1!= null && list2 != null) {
            if (list1.val != list2.val)
                return false;
            list1 = list1.next;
            list2 = list2.next;
        }
        return true;
    }

    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null) {
            return true;
        }
        
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode secondList = reverseList(slow.next);
        slow.next = null;
        // System.out.println("First: ");
        // while(head != null) {
        //     System.out.println(head.val);
        //     head = head.next;
        // }
        
        // System.out.println("secondList: ");
        // while(secondList != null) {
        //     System.out.println(secondList.val);
        //     secondList = secondList.next;
        // }
        



        return isIdentical(head, secondList); 
    }
}