/*
 * @lc app=leetcode id=991 lang=java
 *
 * [991] Broken Calculator
 *
 * https://leetcode.com/problems/broken-calculator/description/
 *
 * algorithms
 * Medium (40.35%)
 * Likes:    159
 * Dislikes: 52
 * Total Accepted:    7.2K
 * Total Submissions: 17.6K
 * Testcase Example:  '2\n3'
 *
 * On a broken calculator that has a number showing on its display, we can
 * perform two operations:
 * 
 * 
 * Double: Multiply the number on the display by 2, or;
 * Decrement: Subtract 1 from the number on the display.
 * 
 * 
 * Initially, the calculator is displaying the number X.
 * 
 * Return the minimum number of operations needed to display the number Y.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: X = 2, Y = 3
 * Output: 2
 * Explanation: Use double operation and then decrement operation {2 -> 4 ->
 * 3}.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: X = 5, Y = 8
 * Output: 2
 * Explanation: Use decrement and then double {5 -> 4 -> 8}.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: X = 3, Y = 10
 * Output: 3
 * Explanation:  Use double, decrement and double {3 -> 6 -> 5 -> 10}.
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: X = 1024, Y = 1
 * Output: 1023
 * Explanation: Use decrement operations 1023 times.
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * 1 <= X <= 10^9
 * 1 <= Y <= 10^9
 * 
 */
//reference: https://leetcode.com/problems/broken-calculator/discuss/234484/JavaC%2B%2BPython-Change-Y-to-X-in-1-Line

class Solution {
    public int brokenCalc(int X, int Y) {
        int res = 0;
        while(Y > X)
        {
            Y = Y % 2 != 0 ? Y + 1 : Y / 2;
            res++;
        }
        return res + X - Y;
    }
}
