/*
 * @lc app=leetcode id=19 lang=cpp
 *
 * [19] Remove Nth Node From End of List
 *
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
 *
 * algorithms
 * Medium (34.31%)
 * Likes:    2028
 * Dislikes: 152
 * Total Accepted:    428.7K
 * Total Submissions: 1.2M
 * Testcase Example:  '[1,2,3,4,5]\n2'
 *
 * Given a linked list, remove the n-th node from the end of list and return
 * its head.
 * 
 * Example:
 * 
 * 
 * Given linked list: 1->2->3->4->5, and n = 2.
 * 
 * After removing the second node from the end, the linked list becomes
 * 1->2->3->5.
 * 
 * 
 * Note:
 * 
 * Given n will always be valid.
 * 
 * Follow up:
 * 
 * Could you do this in one pass?
 * 
 */
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution
{
public:
    ListNode *removeNthFromEnd(ListNode *head, int n)
    {
        ListNode newHead = ListNode(-1);
        newHead.next = head;
        ListNode *slow = &newHead, *fast = &newHead;
        for (int i = 0; i < n; i++)
        {
            fast = fast->next;
        }
        while (fast->next)
        {
            slow = slow->next;
            fast = fast->next;
        }
        ListNode *p = slow->next;
        slow->next = slow->next->next;
        delete p;
        return newHead.next;
    }
};
