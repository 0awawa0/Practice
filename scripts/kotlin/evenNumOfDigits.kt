
/*
Given an array nums of integers, return how many of them contain an even number of digits.
*/

fun findNumbers(nums: IntArray): Int {
    var counter = 0
        
    for (n in nums) {
        var length = 0
        var tN = n
        
        while (tN > 0) {
            tN = tN / 10
            length++
        }
        
        if (length % 2 == 0) counter++
    }
        
    return counter
}

fun main(args: Array<String>) {
    print("Enter numbers separated by space >> ")
    val nums = readLine()!!.split(",").map { it.toInt() }.toIntArray()
    println("Count of numbers with even number of digits: ${findNumbers(nums)}")
}
