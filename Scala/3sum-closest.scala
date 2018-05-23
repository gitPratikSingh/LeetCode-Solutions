object Solution {
    def threeSumClosest(nums: Array[Int], target: Int): Int = {
        scala.util.Sorting.quickSort(nums)
        var closestSum:Int = 0
        var closestDiff:Int = Integer.MAX_VALUE
        for(i <- 0 to nums.length-1 ){
            
            var j = i+1
            var k = nums.length-1
            
            while(j<k){
                val vsum = nums(i) + nums(j) + nums(k)
                var diff = vsum - target
                
                if(diff > 0){
                    k -= 1
                }else{
                    diff = -diff
                    j += 1
                }
                
                if(diff < closestDiff){
                    closestDiff = diff
                    closestSum = vsum
                }
                
            }
        }
        
        closestSum
    }
}
