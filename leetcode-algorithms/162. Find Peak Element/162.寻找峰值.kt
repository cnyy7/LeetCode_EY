/*
 * @lc app=leetcode.cn id=162 lang=kotlin
 *
 * [162] 寻找峰值
 *
 * https://leetcode-cn.com/problems/find-peak-element/description/
 *
 * algorithms
 * Medium (49.57%)
 * Likes:    727
 * Dislikes: 0
 * Total Accepted:    195.6K
 * Total Submissions: 394.6K
 * Testcase Example:  '[1,2,3,1]'
 *
 * 峰值元素是指其值严格大于左右相邻值的元素。
 * 
 * 给你一个整数数组 nums，找到峰值元素并返回其索引。数组可能包含多个峰值，在这种情况下，返回 任何一个峰值 所在位置即可。
 * 
 * 你可以假设 nums[-1] = nums[n] = -∞ 。
 * 
 * 你必须实现时间复杂度为 O(log n) 的算法来解决此问题。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：nums = [1,2,3,1]
 * 输出：2
 * 解释：3 是峰值元素，你的函数应该返回其索引 2。
 * 
 * 示例 2：
 * 
 * 
 * 输入：nums = [1,2,1,3,5,6,4]
 * 输出：1 或 5 
 * 解释：你的函数可以返回索引 1，其峰值元素为 2；
 * 或者返回索引 5， 其峰值元素为 6。
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= nums.length <= 1000
 * -2^31 <= nums[i] <= 2^31 - 1
 * 对于所有有效的 i 都有 nums[i] != nums[i + 1]
 * 
 * 
 */

// @lc code=start
class Solution {
    fun findPeakElement(nums: IntArray): Int {
        var left = 0
        var right = nums.lastIndex
        // 二分查找
        while (left < right) {
            // 计算中间位置并防止溢出
            val mid = left + (right - left) / 2
            // 中间位置的左侧的值，超出下边范围时为Int.MIN_VALUE
            val leftValue = if ((mid - 1) !in nums.indices) Int.MIN_VALUE else nums[mid - 1]
            // 中间位置的右侧的值，超出下边范围时为Int.MIN_VALUE
            val rightValue = if ((mid + 1) !in nums.indices) Int.MIN_VALUE else nums[mid + 1]
            if (nums[mid] > leftValue && nums[mid] > rightValue) {
                // 该位置比左右都大，返回当前位置
                return mid
            } else if (nums[mid] < rightValue) {
                // 当前位置小于右侧位置，left置为 mid+1 
                // 当侧位置不可能是峰值
                left = mid + 1
            } else {
                // 当前位置大于右侧位置，right置为 mid 
                // 当前位置可能是峰值
                right = mid
            }
        }
        // 最后返回 left，此时 left 与 right 相等
        return left
    }
}
// @lc code=end

