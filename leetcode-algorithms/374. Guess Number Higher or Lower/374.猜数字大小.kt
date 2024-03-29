/*
 * @lc app=leetcode.cn id=374 lang=kotlin
 *
 * [374] 猜数字大小
 *
 * https://leetcode-cn.com/problems/guess-number-higher-or-lower/description/
 *
 * algorithms
 * Easy (51.83%)
 * Likes:    176
 * Dislikes: 0
 * Total Accepted:    95K
 * Total Submissions: 182.9K
 * Testcase Example:  '10\n6'
 *
 * 猜数字游戏的规则如下：
 * 
 * 
 * 每轮游戏，我都会从 1 到 n 随机选择一个数字。 请你猜选出的是哪个数字。
 * 如果你猜错了，我会告诉你，你猜测的数字比我选出的数字是大了还是小了。
 * 
 * 
 * 你可以通过调用一个预先定义好的接口 int guess(int num) 来获取猜测结果，返回值一共有 3 种可能的情况（-1，1 或
 * 0）：
 * 
 * 
 * -1：我选出的数字比你猜的数字小 pick < num
 * 1：我选出的数字比你猜的数字大 pick > num
 * 0：我选出的数字和你猜的数字一样。恭喜！你猜对了！pick == num
 * 
 * 
 * 返回我选出的数字。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：n = 10, pick = 6
 * 输出：6
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：n = 1, pick = 1
 * 输出：1
 * 
 * 
 * 示例 3：
 * 
 * 
 * 输入：n = 2, pick = 1
 * 输出：1
 * 
 * 
 * 示例 4：
 * 
 * 
 * 输入：n = 2, pick = 2
 * 输出：2
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 
 * 1 
 * 
 * 
 */

// @lc code=start
/**
 * The API guess is defined in the parent class.
 * @param num your guess
 * @return -1 if num is lower than the guess number 1 if num is higher than the guess number
 * ```
 *               otherwise return 0
 * ```
 * fun guess(num:Int):Int {}
 */
class Solution : GuessGame() {
    override fun guessNumber(n: Int): Int {
        // 最小值
        var left = 1
        // 最大值
        var right = n
        while (left <= right) {
            // 计算中间值
            val mid = left + (right - left) / 2
            // 猜测是否是目标值
            // -1：我选出的数字比你猜的数字小 pick < num
            // 1：我选出的数字比你猜的数字大 pick > num
            // 0：我选出的数字和你猜的数字一样。恭喜！你猜对了！pick == num
            val res = guess(mid)
            if (res == 0) {
                // 是的话返回答案
                return mid
            } else if (res == -1) {
                // 目标值小于mid，目标值在left<->(mid-1)之间
                right = mid - 1
            } else {
                // 目标值大于mid，目标值在(mid+1)<->right之间
                left = mid + 1
            }
        }
        // 为编译通过添加，不会执行到这里
        return -1
    }
}

// @lc code=end

