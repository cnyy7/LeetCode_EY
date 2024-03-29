/*
 * @lc app=leetcode.cn id=125 lang=kotlin
 *
 * [125] 验证回文串
 *
 * https://leetcode-cn.com/problems/valid-palindrome/description/
 *
 * algorithms
 * Easy (47.12%)
 * Likes:    470
 * Dislikes: 0
 * Total Accepted:    318.3K
 * Total Submissions: 675.8K
 * Testcase Example:  '"A man, a plan, a canal: Panama"'
 *
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 解释："amanaplanacanalpanama" 是回文串
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入: "race a car"
 * 输出: false
 * 解释："raceacar" 不是回文串
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 
 * 字符串 s 由 ASCII 字符组成
 * 
 * 
 */

// @lc code=start
class Solution {
    fun isPalindrome(s: String): Boolean {
        // 左侧指针
        var left = 0
        // 右侧指针
        var right = s.length - 1
        while (left < right) {
            while (left < right && !s[left].isLetterOrDigit()) {
                // 左侧指针跳过所有非数字和字母
                left++
            }

            while (left < right && !s[right].isLetterOrDigit()) {
                // 右侧指针跳过所有非数字和字母
                right--
            }

            if (s[left].toLowerCase() != s[right].toLowerCase()) {
                // 不相等时表示不可能是回文串，返回false
                return false
            }
            
            left++
            right--
        }
        return true
    }
}
// @lc code=end

