/*
 * @lc app=leetcode.cn id=154 lang=kotlin
 *
 * [154] 寻找旋转排序数组中的最小值 II
 *
 * https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
 *
 * algorithms
 * Hard (53.08%)
 * Likes:    468
 * Dislikes: 0
 * Total Accepted:    132K
 * Total Submissions: 248.6K
 * Testcase Example:  '[1,3,5]'
 *
 * 已知一个长度为 n 的数组，预先按照升序排列，经由 1 到 n 次 旋转 后，得到输入数组。例如，原数组 nums = [0,1,4,4,5,6,7]
 * 在变化后可能得到：
 *
 * 若旋转 4 次，则可以得到 [4,5,6,7,0,1,4]
 * 若旋转 7 次，则可以得到 [0,1,4,4,5,6,7]
 *
 *
 * 注意，数组 [a[0], a[1], a[2], ..., a[n-1]] 旋转一次 的结果为数组 [a[n-1], a[0], a[1], a[2],
 * ..., a[n-2]] 。
 *
 * 给你一个可能存在 重复 元素值的数组 nums ，它原来是一个升序排列的数组，并按上述情形进行了多次旋转。请你找出并返回数组中的 最小元素 。
 *
 * 你必须尽可能减少整个过程的操作步骤。
 *
 *
 *
 * 示例 1：
 *
 *
 * 输入：nums = [1,3,5]
 * 输出：1
 *
 *
 * 示例 2：
 *
 *
 * 输入：nums = [2,2,2,0,1]
 * 输出：0
 *
 *
 *
 *
 * 提示：
 *
 *
 * n == nums.length
 * 1 <= n <= 5000
 * -5000 <= nums[i] <= 5000
 * nums 原来是一个升序排序的数组，并进行了 1 至 n 次旋转
 *
 *
 *
 *
 * 进阶：这道题与 寻找旋转排序数组中的最小值 类似，但 nums 可能包含重复元素。允许重复会影响算法的时间复杂度吗？会如何影响，为什么？
 *
 */

// @lc code=start
class Solution {
    fun findMin(nums: IntArray): Int {
        // one line solution
        // return nums.min()!!
        // example: 445678812234
        var left = 0
        var right = nums.lastIndex
        while (left < right) {
            // 计算中间位置
            val mid = left + (right - left) / 2
            if (nums[mid] > nums[right]) {
                // 如果中间位置大于右侧，则最小值一定在[mid+1, right]之间
                left = mid + 1
            } else if (nums[mid] < nums[left]) {
                // 如果中间位置小于左侧，则最小值一定在[left, mid]之间
                // mid可能为最小值
                right = mid
            } else {
                // 其他情况下只能往左走一个位置，因为可能有重复值
                right--
            }
        }
        // 返回最后找到的元素
        return nums[left]
    }
}
// @lc code=end
