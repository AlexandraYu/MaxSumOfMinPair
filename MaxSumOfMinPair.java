import java.util.Arrays;
class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0; 
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i=i+2) {
            sum = sum + min(nums[i], nums[i+1]); 
        }
        return sum; 
    }
    private int min(int x, int y) {
        int minimum = 0; 
        minimum = (x>y)? y:x;
        return minimum; 
    }

}
