
/*
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.
*/

fun findErrorNums(nums: IntArray): IntArray {
    val exists = BooleanArray(nums.size)
    var duplicate = -1
    for (num in nums) {
        if (exists[num - 1]) duplicate = num
        exists[num - 1] = true
    }
        
    val missing = exists.indexOf(false) + 1
    return intArrayOf(duplicate, missing)
}