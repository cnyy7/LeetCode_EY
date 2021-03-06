/*
 * @lc app=leetcode id=119 lang=cpp
 *
 * [119] Pascal's Triangle II
 *
 * https://leetcode.com/problems/pascals-triangle-ii/description/
 *
 * algorithms
 * Easy (42.18%)
 * Total Accepted:    194.8K
 * Total Submissions: 454.7K
 * Testcase Example:  '3'
 *
 * Given a non-negative index k where k ≤ 33, return the k^th index row of the
 * Pascal's triangle.
 * 
 * Note that the row index starts from 0.
 * 
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it.
 * 
 * Example:
 * 
 * 
 * Input: 3
 * Output: [1,3,3,1]
 * 
 * 
 * Follow up:
 * 
 * Could you optimize your algorithm to use only O(k) extra space?
 * 
 */
class Solution
{
public:
    vector<int> getRow(int rowIndex)
    {
        vector<int> sol = {1};
        for (int i = 1; i < rowIndex + 1; i++)
        {
            sol.resize(i + 1, 1);
            for (int j = i - 1; j >= 1; j--)
            {
                sol[j] = sol[j] + sol[j - 1];
            }
        }
        return sol;
    }
};
