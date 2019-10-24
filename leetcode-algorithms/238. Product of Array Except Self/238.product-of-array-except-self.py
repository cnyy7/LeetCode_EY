#
# @lc app=leetcode id=238 lang=python3
#
# [238] Product of Array Except Self
#
# https://leetcode.com/problems/product-of-array-except-self/description/
#
# algorithms
# Medium (53.95%)
# Total Accepted:    246.9K
# Total Submissions: 451.9K
# Testcase Example:  '[1,2,3,4]'
#
# Given an array nums of n integers where n > 1,  return an array output such
# that output[i] is equal to the product of all the elements of nums except
# nums[i].
#
# Example:
#
#
# Input:  [1,2,3,4]
# Output: [24,12,8,6]
#
#
# Note: Please solve it without division and in O(n).
#
# Follow up:
# Could you solve it with constant space complexity? (The output array does not
# count as extra space for the purpose of space complexity analysis.)
#
#


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        sol = [0 for i in range(len(nums))]
        left = [1 for i in range(len(nums))]
        right = [1 for i in range(len(nums))]
        left[0] = 1
        right[len(nums)-1] = 1
        for i in range(1, len(nums)):
            left[i] = left[i-1]*nums[i-1]
        for i in range(len(nums)-2, -1, -1):
            right[i] = right[i+1]*nums[i+1]
        for i in range(len(nums)):
            sol[i] = left[i]*right[i]
        return sol
