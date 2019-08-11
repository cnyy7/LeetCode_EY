#
# @lc app=leetcode id=34 lang=python3
#
# [34] Find First and Last Position of Element in Sorted Array
#
# https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
#
# algorithms
# Medium (33.68%)
# Likes:    1771
# Dislikes: 91
# Total Accepted:    323.9K
# Total Submissions: 956.1K
# Testcase Example:  '[5,7,7,8,8,10]\n8'
#
# Given an array of integers nums sorted in ascending order, find the starting
# and ending position of a given target value.
#
# Your algorithm's runtime complexity must be in the order of O(log n).
#
# If the target is not found in the array, return [-1, -1].
#
# Example 1:
#
#
# Input: nums = [5,7,7,8,8,10], target = 8
# Output: [3,4]
#
# Example 2:
#
#
# Input: nums = [5,7,7,8,8,10], target = 6
# Output: [-1,-1]
#
#


class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        left, right, index, found = 0, len(nums) - 1, 0, False
        while left <= right:
            index = (right + left) // 2
            if nums[index] > target:
                right = index - 1
            elif nums[index] < target:
                left = index + 1
            else:
                found = True
                break
        if found:
            while nums[left] != nums[index]:
                left += 1
            while nums[right] != nums[index]:
                right -= 1
            return [left, right]
        return [-1, -1]
