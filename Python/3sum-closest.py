class Solution:
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        nums.sort()
        smallestDiff = -1
        closestSum = 0
        for i in range(len(nums)):
            j=i+1
            k=len(nums)-1
            
            while j<k:
                vsum = nums[i] + nums[j] + nums[k]
                diff = vsum - target
                
                if diff>0:
                    k -= 1
                else:
                    diff = -diff
                    j += 1
                
                if diff < smallestDiff or smallestDiff == -1:
                    smallestDiff = diff
                    closestSum = vsum
                    
        return closestSum
