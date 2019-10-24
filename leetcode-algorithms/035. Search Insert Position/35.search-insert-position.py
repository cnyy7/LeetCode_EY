#
# @lc app=leetcode id=35 lang=python3
#
# [35] Search Insert Position
#
# https://leetcode.com/problems/search-insert-position/description/
#
# algorithms
# Easy (40.48%)
# Total Accepted:    381.4K
# Total Submissions: 938.6K
# Testcase Example:  '[1,3,5,6]\n5'
#
# Given a sorted array and a target value, return the index if the target is
# found. If not, return the index where it would be if it were inserted in
# order.
#
# You may assume no duplicates in the array.
#
# Example 1:
#
#
# Input: [1,3,5,6], 5
# Output: 2
#
#
# Example 2:
#
#
# Input: [1,3,5,6], 2
# Output: 1
#
#
# Example 3:
#
#
# Input: [1,3,5,6], 7
# Output: 4
#
#
# Example 4:
#
#
# Input: [1,3,5,6], 0
# Output: 0
#
#
#


class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        # low=0
        # high=len(nums)-1
        # mid=0
        # while low<=high:
        #     mid=(low+high)//2
        #     if nums[mid]==target:
        #         return mid
        #     elif nums[mid]>target:
        #         high=mid-1
        #     else:
        #         low=mid+1
        # return low
        for i in range(len(nums)):
            if target <= nums[i]:
                return i
        return len(nums)
