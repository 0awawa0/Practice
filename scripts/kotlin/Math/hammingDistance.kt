/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.
*/

fun hammingDistance(x: Int, y: Int): Int {
    var t = x.xor(y)
    var counter = 0
    while (t != 0) {
        counter += if (t % 2 == 1) 1 else 0
        t = t.shr(1)
    }
    return counter
}

fun main(args: Array<String>) {
    print("Enter two numbers >> ")
    var nums = readLine()!!.split(' ').map { it.toInt() }.toIntArray()
    println("Hamming distance is ${hammingDistance(nums[0], nums[1])}")
}
