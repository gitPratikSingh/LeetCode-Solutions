class Solution:
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        num=0
        
        for i in range(32):
            vsum = 0
            for vnum in nums:
                vsum += ((vnum>>i) & 1)
            
            vsum = vsum%3
            num |= (vsum<<i)
        
        return num
