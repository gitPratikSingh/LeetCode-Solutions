class Solution:
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        res = []
        for i in range(len(nums)):
            if i>0 and nums[i]==nums[i-1]:
                continue
                
            j=i+1
            k=len(nums)-1
            
            while j<k:
                vsum = nums[i] + nums[j] + nums[k]
                if vsum == 0:
                    res.append([nums[i], nums[j], nums[k]])
                    
                    numj = nums[j]
                    while j<k and numj == nums[j]:
                        j += 1
                        
                    numk = nums[k]
                    while k>j and numk == nums[k]:
                        k -= 1
                    
                elif vsum>0:
                    k -= 1
                else:
                    j += 1
                    
                    
        return res
