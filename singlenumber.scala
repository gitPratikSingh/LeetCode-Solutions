/*
# Time:  O(n)
# Space: O(1)
#
# Given an array of integers, every element appears twice except for one. Find that single one.
#
# Note:
# Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
#
*/

object Solution {
    def singleNumber(nums: Array[Int]): Int = {
        var result:Int = 0
        
        for(i <- 0 until nums.length){
            result ^= nums(i)  
        }
        
        result
    }
}
