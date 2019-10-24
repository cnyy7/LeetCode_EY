/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 *
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 *
 * algorithms
 * Easy (47.58%)
 * Likes:    2335
 * Dislikes: 336
 * Total Accepted:    608.6K
 * Total Submissions: 1.3M
 * Testcase Example:  '[1,2,4]\n[1,3,4]'
 *
 * Merge two sorted linked lists and return it as a new list. The new list
 * should be made by splicing together the nodes of the first two lists.
 * 
 * Example:
 * 
 * Input: 1.2.4, 1.3.4
 * Output: 1.1.2.3.4.4
 * 
 * 
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // iteratively
        ListNode newl = new ListNode(0);
        ListNode l = newl;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                l.next = l2;
                l2 = l2.next;
            } else {
                l.next = l1;
                l1 = l1.next;
            }
            l = l.next;
        }
        l.next = l1 != null ? l1 : l2;
        return newl.next;
        // recursively
        // if (l1 == null || l2 != null && l1.val > l2.val) {
        // ListNode temp = l2;
        // l2 = l1;
        // l1 = temp;
        // }
        // if (l1 != null) {
        // l1.next = mergeTwoLists(l1.next, l2);
        // }
        // return l1;
    }
}
