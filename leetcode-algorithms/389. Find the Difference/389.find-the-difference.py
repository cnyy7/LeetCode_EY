#
# @lc app=leetcode id=389 lang=python3
#
# [389] Find the Difference
#
# https://leetcode.com/problems/find-the-difference/description/
#
# algorithms
# Easy (53.17%)
# Likes:    518
# Dislikes: 232
# Total Accepted:    149.2K
# Total Submissions: 280K
# Testcase Example:  '"abcd"\n"abcde"'
#
#
# Given two strings s and t which consist of only lowercase letters.
#
# String t is generated by random shuffling string s and then add one more
# letter at a random position.
#
# Find the letter that was added in t.
#
# Example:
#
# Input:
# s = "abcd"
# t = "abcde"
#
# Output:
# e
#
# Explanation:
# 'e' is the letter that was added.
#
#


class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        res = ord(t[len(t) - 1])
        for i in range(len(s)):
            res ^= ord(s[i])
            res ^= ord(t[i])
        return chr(res)
