

/*
Let's call an array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... arr[i-1] < arr[i]
arr[i] > arr[i+1] > ... > arr[arr.length - 1]

Given an integer array arr that is guaranteed to be a mountain, 
return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
*/

fun peakIndexInMountainArray(arr: IntArray): Int {
        
    var l = 0
    var r = arr.size - 1
    var mid = l + (r - l) / 2
        
    while (l < r) {
        if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) break                     
        if (arr[mid + 1] > arr[mid]) { 
            l = mid
            mid = l + (r - l) / 2
        } else {
            if (arr[mid - 1] > arr[mid]) {
                r = mid
                mid = l + (r - l) / 2
            }
        }
    }
        
    return mid
}

fun main(args: Array<String>) {
    print("Enter a mountain array >> ")
    val nums = readLine()!!.split(',').map { it.toInt() }.toIntArray()
    println("Peak index >> ${peakIndexInMountainArray(nums)}")
}

