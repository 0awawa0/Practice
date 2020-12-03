
/*
Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.
*/



fun uniqueOccurrences(arr: IntArray): Boolean {
    var table = HashMap<Int, Int>()
        
    for (i in arr) {
        if (i in table.keys) table[i] = table[i]!! + 1
        else table[i] = 1
    }
    return table.keys.size == table.values.toSet().size
}

fun main(args: Array<String>) {
    println("Enter the array of numbers >> ")
    val nums = readLine()!!.split(",").map { it.toInt() }.toIntArray()
    println("Result: ${uniqueOccurrences(nums)}")
}
