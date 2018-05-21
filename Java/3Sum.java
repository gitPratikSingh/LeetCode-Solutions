class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>(); 
        for(int i=0; i<nums.length; i++){
            for(int j=i+1, int k=nums.length-1; j<k; ;){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List<Integer> l = new ArrayList<>(); 
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    res.add(l);
                    
                    j
                }
            }
        }
        
    }
}
