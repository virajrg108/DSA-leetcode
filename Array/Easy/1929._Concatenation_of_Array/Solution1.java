// https://leetcode.com/problems/concatenation-of-array/

// 1929. Concatenation of Array

public class Solution1 {
  public int[] getConcatenation(int[] nums) {
    int n = nums.length;
    int[] ans = new int[2 * n];
    for (int i = 0; i < n; i++) {
      ans[i] = nums[i];
      ans[i + n] = nums[i];
    }
    return ans;
  }
}