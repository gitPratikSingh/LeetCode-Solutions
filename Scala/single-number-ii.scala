object Solution {
    def singleNumber(nums: Array[Int]): Int = {
        
        var num:Int = 0
        
        for(i <- 0 until 32){
            var vsum = 0
            for(vnum <- nums){
                vsum += ((vnum>>i) & 1)
            }
            vsum = vsum%3
            num |= (vsum<<i)
        }
        
        num
    }
}
