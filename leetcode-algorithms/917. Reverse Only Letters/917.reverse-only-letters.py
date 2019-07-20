#
# @lc app=leetcode id=917 lang=python3
#
# [917] Reverse Only Letters
#
# https://leetcode.com/problems/reverse-only-letters/description/
#
# algorithms
# Easy (55.96%)
# Likes:    271
# Dislikes: 26
# Total Accepted:    29.7K
# Total Submissions: 53.1K
# Testcase Example:  '"ab-cd"'
#
# Given a string S, return the "reversed" string where all characters that are
# not a letter stay in the same place, and all letters reverse their
# positions.
#
#
#
#
#
#
#
#
#
#
#
#
#
# Example 1:
#
#
# Input: "ab-cd"
# Output: "dc-ba"
#
#
#
# Example 2:
#
#
# Input: "a-bC-dEf-ghIj"
# Output: "j-Ih-gfE-dCba"
#
#
#
# Example 3:
#
#
# Input: "Test1ng-Leet=code-Q!"
# Output: "Qedo1ct-eeLg=ntse-T!"
#
#
#
#
#
# Note:
#
#
# S.length <= 100
# 33 <= S[i].ASCIIcode <= 122 
# S doesn't contain \ or "
#
#
#
#
#
#


class Solution:
    def reverseOnlyLetters(self, S: str) -> str:
        i, j = 0, len(S) - 1
        strlist = list(S)
        while i < j:
            if not strlist[i].isalpha():
                i += 1
            elif not strlist[j].isalpha():
                j -= 1
            else:
                strlist[i], strlist[j] = strlist[j], strlist[i]
                i += 1
                j -= 1
        return ''.join(strlist)
