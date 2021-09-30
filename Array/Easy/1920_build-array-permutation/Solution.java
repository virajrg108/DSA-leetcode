// https://leetcode.com/problems/build-array-from-permutation/

// Build Array from Permutation

public class Solution {
  public int[] buildArray(int[] nums) {
    int[] res = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      res[i] = nums[nums[i]];
    }
    return res;
  }
}
