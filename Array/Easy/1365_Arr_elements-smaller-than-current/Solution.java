// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

// 1365. How Many Numbers Are Smaller Than the Current Number

class Solution {
  public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] ans = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      int cnt = 0;
      for (int j = 0; j < nums.length; j++) {
        if (i != j && (nums[j] < nums[i])) {
          cnt++;
        }
        ans[i] = cnt;
      }
    }
    return ans;
  }
}