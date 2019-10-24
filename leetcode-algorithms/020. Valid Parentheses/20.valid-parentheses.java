/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 *
 * https://leetcode.com/problems/valid-parentheses/description/
 *
 * algorithms
 * Easy (35.96%)
 * Likes:    2805
 * Dislikes: 138
 * Total Accepted:    570.4K
 * Total Submissions: 1.6M
 * Testcase Example:  '"()"'
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * 
 * 
 * Note that an empty string is also considered valid.
 * 
 * Example 1:
 * 
 * 
 * Input: "()"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "()[]{}"
 * Output: true
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: "(]"
 * Output: false
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: "([)]"
 * Output: false
 * 
 * 
 * Example 5:
 * 
 * 
 * Input: "{[]}"
 * Output: true
 * 
 * 
 */
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> sol = new Stack<>();
        Map<Character, Character> m = new HashMap<>();
        m.put('[', ']');
        m.put('{', '}');
        m.put('(', ')');
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
            case '[':
            case '{':
            case '(':
                sol.push(s.charAt(i));
                break;
            case ']':
            case ')':
            case '}':
                if (sol.size() == 0) {
                    return false;
                }
                if (s.charAt(i) == m.get(sol.peek())) {
                    sol.pop();
                }
                break;
            }
        }
        return sol.size() == 0;
    }
}
