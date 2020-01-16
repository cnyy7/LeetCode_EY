/*
 * @lc app=leetcode id=65 lang=java
 *
 * [65] Valid Number
 *
 * https://leetcode.com/problems/valid-number/description/
 *
 * algorithms
 * Hard (14.45%)
 * Likes:    580
 * Dislikes: 4074
 * Total Accepted:    147.8K
 * Total Submissions: 1M
 * Testcase Example:  '"0"'
 *
 * Validate if a given string can be interpreted as a decimal number.
 * 
 * Some examples:
 * "0" => true
 * " 0.1 " => true
 * "abc" => false
 * "1 a" => false
 * "2e10" => true
 * " -90e3   " => true
 * " 1e" => false
 * "e3" => false
 * " 6e-1" => true
 * " 99e2.5 " => false
 * "53.5e93" => true
 * " --6 " => false
 * "-+3" => false
 * "95a54e53" => false
 * 
 * Note: It is intended for the problem statement to be ambiguous. You should
 * gather all requirements up front before implementing one. However, here is a
 * list of characters that can be in a valid decimal number:
 * 
 * 
 * Numbers 0-9
 * Exponent - "e"
 * Positive/negative sign - "+"/"-"
 * Decimal point - "."
 * 
 * 
 * Of course, the context of these characters also matters in the input.
 * 
 * Update (2015-02-10):
 * The signature of the C++ function had been updated. If you still see your
 * function signature accepts a const char * argument, please click the reload
 * button to reset your code definition.
 * 
 */

// @lc code=start
class Solution {
    private boolean isSgn(char c) {
        return c == '+' || c == '-';
    }

    private boolean isDot(char c) {
        return c == '.';
    }

    private boolean isNum(char c) {
        return c <= '9' && c >= '0';
    }

    private boolean isE(char c) {
        return c == 'e' || c == 'E';
    }

    public boolean isNumber(String s) {
        int pos = 0;
        boolean hasNum = false;
        while (pos < s.length() && s.charAt(pos) == ' ') {
            pos++;
        }
        if (pos < s.length() && isSgn(s.charAt(pos))) {
            pos++;
        }
        while (pos < s.length() && isNum(s.charAt(pos))) {
            hasNum = true;
            pos++;
        }
        if (pos < s.length() && isDot(s.charAt(pos))) {
            pos++;
        }
        while (pos < s.length() && isNum(s.charAt(pos))) {
            hasNum = true;
            pos++;
        }
        if (hasNum && pos < s.length() && isE(s.charAt(pos))) {
            hasNum = false;
            pos++;
            if (pos < s.length() && isSgn(s.charAt(pos)))
                pos++;
        }
        while (pos < s.length() && isNum(s.charAt(pos))) {
            hasNum = true;
            pos++;
        }
        while (pos < s.length() && s.charAt(pos) == ' ') {
            pos++;
        }
        return (pos == s.length()) && hasNum;
    }
}
// @lc code=end
