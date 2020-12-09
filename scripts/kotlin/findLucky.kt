

/*
Given an array of integers arr, a lucky integer is an integer which has a frequency in the array equal to its value.

Return a lucky integer in the array. If there are multiple lucky integers return the largest of them. If there is no lucky integer return -1.
*/


fun findLucky(arr: IntArray): Int {
    val map = HashMap<Int, Int>()
        
    for (i in arr) {
        val x = map[i] ?: 0
        map[i] = x + 1
    }
    println(map)
    var maxLucky = -1
    for (key in map.keys) {
        if (map[key] == key) {
            if (maxLucky < key) {
                maxLucky = key
            }
        }
    }
        
    return maxLucky
}

fun main(args: Array<String>) {
    println("Enter array >> ")
    val arr = readLine()!!.split(',').map { it.toInt() }.toIntArray()
    println("Lucky number is ${findLucky(arr)}")
}
