/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Implement strStr()
 *
 * https://leetcode.com/problems/implement-strstr/description/
 *
 * algorithms
 * Easy (31.30%)
 * Likes:    839
 * Dislikes: 1261
 * Total Accepted:    415.4K
 * Total Submissions: 1.3M
 * Testcase Example:  '"hello"\n"ll"'
 *
 * Implement strStr().
 * 
 * Return the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 * 
 * Example 1:
 * 
 * 
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * 
 * 
 * Clarification:
 * 
 * What should we return when needle is an empty string? This is a great
 * question to ask during an interview.
 * 
 * For the purpose of this problem, we will return 0 when needle is an empty
 * string. This is consistent to C's strstr() and Java's indexOf().
 * 
 */
class Solution {
    int[] bc = new int[256];

    int[] getbc(String pattern) // 求模板串坏字符表
    {
        int patternLen = pattern.length();
        for (int i = 0; i < 256; ++i)
            bc[i] = -1;
        for (int i = 0; i < patternLen; ++i) {
            bc[pattern.charAt(i)] = i;
        }
        return bc;
    }

    public int strStr(String haystack, String needle) {
        if (needle == "")
            return 0;
        int[] abc = getbc(needle);
        int i = 0, j = 0, span;
        int patternlast = needle.length() - 1, patternLen = needle.length(), strLen = haystack.length();
        while (i + patternLen <= strLen) {
            for (j = patternlast; j >= 0 && needle.charAt(j) == haystack.charAt(i + j); --j)
                ;
            if (j == -1)
                break;
            else {
                span = j - abc[haystack.charAt(i + j)];
                i += (span > 0) ? span : 1;
            }
        }
        return j == -1 ? i : -1;
    }
}
