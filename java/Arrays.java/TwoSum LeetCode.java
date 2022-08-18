
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9
// we return [0, 1].








class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int a[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                    break;
                }    
            }
        }
            return a;
    }
}



// [1,0]
