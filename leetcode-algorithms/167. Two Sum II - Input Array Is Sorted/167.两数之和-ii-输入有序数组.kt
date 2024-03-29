/*
 * @lc app=leetcode.cn id=167 lang=kotlin
 *
 * [167] 两数之和 II - 输入有序数组
 *
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/description/
 *
 * algorithms
 * Easy (58.73%)
 * Likes:    678
 * Dislikes: 0
 * Total Accepted:    361.2K
 * Total Submissions: 615.1K
 * Testcase Example:  '[2,7,11,15]\n9'
 *
 * 给你一个下标从 1 开始的整数数组 numbers ，该数组已按 非递减顺序排列  ，请你从数组中找出满足相加之和等于目标数 target
 * 的两个数。如果设这两个数分别是 numbers[index1] 和 numbers[index2] ，则 1 <= index1 < index2 <=
 * numbers.length 。
 * 
 * 以长度为 2 的整数数组 [index1, index2] 的形式返回这两个整数的下标 index1 和 index2。
 * 
 * 你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
 * 
 * 你所设计的解决方案必须只使用常量级的额外空间。
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：numbers = [2,7,11,15], target = 9
 * 输出：[1,2]
 * 解释：2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。返回 [1, 2] 。
 * 
 * 示例 2：
 * 
 * 
 * 输入：numbers = [2,3,4], target = 6
 * 输出：[1,3]
 * 解释：2 与 4 之和等于目标数 6 。因此 index1 = 1, index2 = 3 。返回 [1, 3] 。
 * 
 * 示例 3：
 * 
 * 
 * 输入：numbers = [-1,0], target = -1
 * 输出：[1,2]
 * 解释：-1 与 0 之和等于目标数 -1 。因此 index1 = 1, index2 = 2 。返回 [1, 2] 。
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 2 <= numbers.length <= 3 * 10^4
 * -1000 <= numbers[i] <= 1000
 * numbers 按 非递减顺序 排列
 * -1000 <= target <= 1000
 * 仅存在一个有效答案
 * 
 * 
 */

// @lc code=start
class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        // 左侧的下标，小的值
        var left = 0
        // 右侧的下标，大的值
        var right = numbers.size - 1
        while (true) {
            if (numbers[left] + numbers[right] > target) {
                // 和大于目标值时大的值变小，右指针往左移动
                right--
            } else if (numbers[left] + numbers[right] < target) {
                // 和小于目标值时小的值变大，左指针往右移动
                left++
            } else {
                // 相等时返回结果
                return intArrayOf(left + 1, right + 1)
            }
        }
    }
}
// @lc code=end

