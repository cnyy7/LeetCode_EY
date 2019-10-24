#
# @lc app=leetcode id=941 lang=python3
#
# [941] Valid Mountain Array
#
# https://leetcode.com/problems/valid-mountain-array/description/
#
# algorithms
# Easy (34.67%)
# Total Accepted:    17K
# Total Submissions: 48.5K
# Testcase Example:  '[2,1]'
#
# Given an array A of integers, return true if and only if it is a valid
# mountain array.
#
# Recall that A is a mountain array if and only if:
#
#
# A.length >= 3
# There exists some i with 0 < i < A.length - 1 such that:
#
# A[0] < A[1] < ... A[i-1] < A[i]
# A[i] > A[i+1] > ... > A[B.length - 1]
#
#
#
#
#
#
# Example 1:
#
#
# Input: [2,1]
# Output: false
#
#
#
# Example 2:
#
#
# Input: [3,5,5]
# Output: false
#
#
#
# Example 3:
#
#
# Input: [0,3,2,1]
# Output: true
#
#
#
#
#
# Note:
#
#
# 0 <= A.length <= 10000
# 0 <= A[i] <= 10000 
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


class Solution:
    def validMountainArray(self, A: List[int]) -> bool:
        if len(A) <= 2:
            return False
        N = len(A)
        i = 0
        while i < N - 1 and A[i] < A[i + 1]:
            i += 1
        if i == 0 or i == N - 1:
            return False
        while i < N - 1 and A[i] > A[i + 1]:
            i += 1
        return i == N - 1
