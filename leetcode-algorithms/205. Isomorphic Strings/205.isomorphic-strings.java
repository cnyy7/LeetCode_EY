/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 *
 * https://leetcode.com/problems/isomorphic-strings/description/
 *
 * algorithms
 * Easy (37.49%)
 * Likes:    824
 * Dislikes: 237
 * Total Accepted:    217.5K
 * Total Submissions: 574.6K
 * Testcase Example:  '"egg"\n"add"'
 *
 * Given two strings s and t, determine if they are isomorphic.
 * 
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * 
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character but a character may map to itself.
 * 
 * Example 1:
 * 
 * 
 * Input: s = "egg", t = "add"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "foo", t = "bar"
 * Output: false
 * 
 * Example 3:
 * 
 * 
 * Input: s = "paper", t = "title"
 * Output: true
 * 
 * Note:
 * You may assume both s and t have the same length.
 * 
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] maps = new int[128],mapt = new int[128];
        for (int i = 0; i < s.length(); i++) {
            if (maps[s.charAt(i)] != mapt[t.charAt(i)]) {
                return false;
            }
            maps[s.charAt(i)] = i + 1;
            mapt[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
