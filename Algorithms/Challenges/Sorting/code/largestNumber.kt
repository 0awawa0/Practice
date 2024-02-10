
/*
Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.
*/

fun largestNumber(nums: IntArray): String {
    if (nums.all { it == 0 }) return "0"
    val comparator = object: Comparator<String> { 
        override fun compare(first: String, second: String): Int {
            return (second + first).compareTo(first + second)
        }
    }
    val strings = nums.map { it.toString()}.sortedWith(comparator)
    return strings.joinToString(separator="")
}