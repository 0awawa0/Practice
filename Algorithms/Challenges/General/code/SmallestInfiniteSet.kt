

/*
You have a set which contains all positive integers [1, 2, 3, 4, 5, ...].

Implement the SmallestInfiniteSet class:

    + SmallestInfiniteSet() Initializes the SmallestInfiniteSet object to contain all positive integers.
    + int popSmallest() Removes and returns the smallest integer contained in the infinite set.
    + void addBack(int num) Adds a positive integer num back into the infinite set, if it is not already in the infinite set.

*/

class SmallestInfiniteSet() {

    private val nums = TreeSet<Int>()
    init { for (i in 1..1000) nums.add(i) }
    
    fun popSmallest(): Int = nums.pollFirst()
    fun addBack(num: Int) = nums.add(num)
}