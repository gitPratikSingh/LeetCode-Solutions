class Solution:
    def fourSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        resultList = []
        nums.sort()
        for a in range(len(nums)):
            b = a+1
            
            if(a>0 and nums[a] == nums[a-1]):
                continue
            
            while(b<len(nums)-2):
                if(b>a+1 and nums[b] == nums[b-1]):
                    b += 1
                    continue
                    
                c = b+1
                d = len(nums)-1
            
                while(c<d):
                    vsum = nums[a] + nums[b] + nums[c] + nums[d]
                    if vsum == target:
                        vres = [nums[a] , nums[b] , nums[c] , nums[d]]
                        vres.sort()
                        resultList.append(vres)
                        
                        c += 1
                        d -= 1
                        
                        while(c+1<d and nums[c] == nums[c+1]): 
                            c += 1
                        
                        while(c<d-1 and nums[d] == nums[d-1]): 
                            d -= 1
                            
                        
                    elif vsum > target:
                        d -= 1
                    else:
                        c += 1
                b += 1
        
        return resultList
                
