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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode combinedList = new ListNode(-1,null);
        ListNode head = combinedList;

        while(list1 != null && list2 != null) {

            if(list1.val <= list2.val) {
                combinedList.next = list1;
                list1 = list1.next;
            } else {
                combinedList.next = list2;
                list2 = list2.next;
            }

            combinedList = combinedList.next;
        }

        if(list1 != null) {
            combinedList.next = list1;
        } else {
            combinedList.next = list2;
        }

        return head.next;
    }
}