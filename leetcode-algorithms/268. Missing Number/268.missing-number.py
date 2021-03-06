#
# @lc app=leetcode id=268 lang=python3
#
# [268] Missing Number
#
# https://leetcode.com/problems/missing-number/description/
#
# algorithms
# Easy (47.59%)
# Total Accepted:    262.3K
# Total Submissions: 546.8K
# Testcase Example:  '[3,0,1]'
#
# Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find
# the one that is missing from the array.
#
# Example 1:
#
#
# Input: [3,0,1]
# Output: 2
#
#
# Example 2:
#
#
# Input: [9,6,4,2,3,5,7,0,1]
# Output: 8
#
#
# Note:
# Your algorithm should run in linear runtime complexity. Could you implement
# it using only constant extra space complexity?
#


class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        # sol = len(nums);
        # for i in range(len(nums)):
        #     sol ^= nums[i]
        #     sol ^= i
        # return sol
        return sum(range(len(nums)+1)) - sum(nums)
