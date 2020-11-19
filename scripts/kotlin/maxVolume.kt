/*
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). 
Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

Notice that you may not slant the container.
*/

fun maxVolume(height: IntArray): Int {     
    var i = 0
    var j = height.lastIndex
    var maxVolume = minOf(height[i], height[j]) * (j - i)
        
    while (i != j) {
        val currVolume = minOf(height[i], height[j]) * (j - i)
        if (maxVolume < currVolume) {
            maxVolume = currVolume
        }
            
        if (height[i] < height[j]) {
            i += 1
        } else {
            j -= 1
        }
    } 
        
    return maxVolume
}


fun main(args: Array<String>) {
    val nums = args[0].split(',').map { it.toInt() }.toIntArray()
    println("Max volume is ${maxVolume(nums)}")
} 
