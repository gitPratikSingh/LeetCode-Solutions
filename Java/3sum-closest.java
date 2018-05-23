class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        int closest = Integer.MAX_VALUE;
        int closestSum = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1, k=nums.length-1; j<k; ){
                int sum = (nums[i] + nums[j] + nums[k]);
                
                
                int diff = sum-target;
                if(diff>0){
                    k--;
                }else{
                    diff = -diff;
                    j++;
                }
                
                if(diff < closest){
                    closest = diff;
                    closestSum = sum;
                }
            }
        }
        
        return closestSum;
    }
}
