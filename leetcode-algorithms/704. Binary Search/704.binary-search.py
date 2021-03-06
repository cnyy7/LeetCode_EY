#
# @lc app=leetcode id=704 lang=python3
#
# [704] Binary Search
#
# https://leetcode.com/problems/binary-search/description/
#
# algorithms
# Easy (47.96%)
# Likes:    279
# Dislikes: 32
# Total Accepted:    58.7K
# Total Submissions: 121.3K
# Testcase Example:  '[-1,0,3,5,9,12]\n9'
#
# Given a sorted (in ascending order) integer array nums of n elements and a
# target value, write a function to search target in nums. If target exists,
# then return its index, otherwise return -1.
#
#
# Example 1:
#
#
# Input: nums = [-1,0,3,5,9,12], target = 9
# Output: 4
# Explanation: 9 exists in nums and its index is 4
#
#
#
# Example 2:
#
#
# Input: nums = [-1,0,3,5,9,12], target = 2
# Output: -1
# Explanation: 2 does not exist in nums so return -1
#
#
#
#
# Note:
#
#
# You may assume that all elements in nums are unique.
# n will be in the range [1, 10000].
# The value of each element in nums will be in the range [-9999, 9999].
#
#
#


class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left, right = 0, len(nums)-1
        while left <= right:
            index = (right + left) // 2
            if nums[index] > target:
                right = index-1
            elif nums[index] < target:
                left = index+1
            else:
                return index
        return -1
