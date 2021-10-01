// https://leetcode.com/problems/running-sum-of-1d-array/

// 1480. Running Sum of 1d Array

public class Solution {
  public int[] runningSum(int[] nums) {
    int rsum = 0;
    for (int i = 0; i < nums.length; i++) {
      rsum = rsum + nums[i];
      nums[i] = rsum;
    }
    return nums;
  }
}
