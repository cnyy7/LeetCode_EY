#
# @lc app=leetcode id=205 lang=python3
#
# [205] Isomorphic Strings
#
# https://leetcode.com/problems/isomorphic-strings/description/
#
# algorithms
# Easy (37.49%)
# Likes:    824
# Dislikes: 237
# Total Accepted:    217.5K
# Total Submissions: 574.6K
# Testcase Example:  '"egg"\n"add"'
#
# Given two strings s and t, determine if they are isomorphic.
#
# Two strings are isomorphic if the characters in s can be replaced to get t.
#
# All occurrences of a character must be replaced with another character while
# preserving the order of characters. No two characters may map to the same
# character but a character may map to itself.
#
# Example 1:
#
#
# Input: s = "egg", t = "add"
# Output: true
#
#
# Example 2:
#
#
# Input: s = "foo", t = "bar"
# Output: false
#
# Example 3:
#
#
# Input: s = "paper", t = "title"
# Output: true
#
# Note:
# You may assume both s and t have the same length.
#
#


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        import collections
        maps, mapt = collections.defaultdict(int), collections.defaultdict(int)
        for i in range(len(s)):
            if maps[s[i]] != mapt[t[i]]:
                return False
            maps[s[i]] = mapt[t[i]] = i + 1
        return True

        # maps, mapt = [0]*128, [0]*128
        # for i in range(len(s)):
        #     if maps[ord(s[i])] != mapt[ord(t[i])]:
        #         return False
        #     maps[ord(s[i])] = mapt[ord(t[i])] = i + 1;
        # return True
