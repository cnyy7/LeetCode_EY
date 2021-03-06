#
# @lc app=leetcode id=953 lang=python3
#
# [953] Verifying an Alien Dictionary
#
# https://leetcode.com/problems/verifying-an-alien-dictionary/description/
#
# algorithms
# Easy (56.29%)
# Likes:    170
# Dislikes: 62
# Total Accepted:    19.3K
# Total Submissions: 34.8K
# Testcase Example:  '["hello","leetcode"]\n"hlabcdefgijkmnopqrstuvwxyz"'
#
# In an alien language, surprisingly they also use english lowercase letters,
# but possibly in a different order. The order of the alphabet is some
# permutation of lowercase letters.
#
# Given a sequence of words written in the alien language, and the order of the
# alphabet, return true if and only if the given words are sorted
# lexicographicaly in this alien language.
#
#
#
#
# Example 1:
#
#
# Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
# Output: true
# Explanation: As 'h' comes before 'l' in this language, then the sequence is
# sorted.
#
#
#
# Example 2:
#
#
# Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
# Output: false
# Explanation: As 'd' comes after 'l' in this language, then words[0] >
# words[1], hence the sequence is unsorted.
#
#
#
# Example 3:
#
#
# Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
# Output: false
# Explanation: The first three characters "app" match, and the second string is
# shorter (in size.) According to lexicographical rules "apple" > "app",
# because 'l' > '∅', where '∅' is defined as the blank character which is less
# than any other character (More info).
#
#
#
#
# Note:
#
#
# 1 <= words.length <= 100
# 1 <= words[i].length <= 20
# order.length == 26
# All characters in words[i] and order are english lowercase letters.
#
#
#
#
#
#


class Solution:
    def isAlienSorted(self, words: List[str], order: str) -> bool:
        def compare(a, b, ordermap):
            i = 0
            while i < len(a) and i < len(b):
                if ordermap[a[i]] < ordermap[b[i]]:
                    return True
                elif ordermap[a[i]] > ordermap[b[i]]:
                    return False
                else:
                    i += 1
            return len(a) == len(b) or len(a) < len(b)
        ordermap = {key: value for value, key in enumerate(order)}
        i = 0
        while i < len(words) - 1:
            if not compare(words[i], words[i+1], ordermap):
                return False
            i += 1
        return True
