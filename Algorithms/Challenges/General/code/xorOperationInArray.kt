
/*
Given an integer n and an integer start.

Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.

Return the bitwise XOR of all elements of nums.
*/

fun xorOperation(n: Int, start: Int): Int {
    var result = 0
    for (i in 0 until n) {
        result = result.xor(start + i * 2)
    }
    return result
}

fun main(args: Array<String>) {
    print("Enter n >> ")
    val n = readLine()!!.toInt()
    print("Etner start >> ")
    val start = readLine()!!.toInt()
    println("xorOperation(n, start) = ${xorOperation(n, start)}")
}
