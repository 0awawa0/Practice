
/*
Given an array of numbers arr. A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.

Return true if the array can be rearranged to form an arithmetic progression, otherwise, return false.
*/

fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        
    if (arr.size == 2) return arr[0] != arr[1]
        
    var arrCopy = arr.copyOf()
    arrCopy.sort()
        
    val diff = arrCopy[1] - arrCopy[0]
    for (i in 1 until arrCopy.size - 1) {
        if (arrCopy[i + 1] - arrCopy[i] != diff) return false
    }
        
    return true
}

fun main(args: Array<String>) {
    print("Enter the number array >> ")
    val nums = readLine()!!.split(',').map { it.toInt() }.toIntArray()
    print("Result >> ${canMakeArithmeticProgression(nums)}")
}
