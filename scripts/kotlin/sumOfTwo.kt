
/*
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.
*/


fun sumOfTwo(nums: IntArray, target: Int): IntArray {
    val table = HashMap<Int, Int>()
        
    for (i in 0 until nums.size) {
        if (table.contains(target - nums[i])) {
            return intArrayOf(table[target - nums[i]] ?: 0, i)
        }
        table[nums[i]] = i
    }
        
    return intArrayOf(0, 0)
}

fun main(args: Array<String>) {
  val nums = args[0].split(',').map { it.toInt() }.toIntArray()
  val target = args[1].toInt()
  println("Indices of elements sum of which equals $target: ${sumOfTwo(nums, target).joinToString(" ")}")
}
