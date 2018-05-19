class Solution {
    
    public int singleNumber(int[] nums) {
        
        int sum = 0;
        int num = 0;
        for(int i=0; i<32; i++){
            sum = 0;
            
            for(int c=0; c<nums.length; c++){
                sum += (1 & (nums[c]>>i));
            }
            
            sum = sum%3;
            // now sum can be 1 or 0, think!
            
            num |= sum<<i; 
            
        }
        
        return num;
    }
}
