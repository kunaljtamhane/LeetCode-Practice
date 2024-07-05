// Concatenation of Array: https://leetcode.com/problems/concatenation-of-array/
class Solution{
  public int[] getConcatenation(int[]nums){
    int n= nums.length;
    int[] ans = new int [2*n];
    for(i=0; i<n; i++){
      ans[i] = nums[i];
      ans[i+n]=nums[i];
    }
    return ans;
  }
}
