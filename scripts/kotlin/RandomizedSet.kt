
/*
Implement the RandomizedSet class:

    * RandomizedSet() Initializes the RandomizedSet object.
    * bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
    * bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
    * int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.

You must implement the functions of the class such that each function works in average O(1) time complexity.
*/


class RandomizedSet() {
    
    private val innerSet = HashSet<Int>()

    fun insert(`val`: Int): Boolean {
        if (`val` in innerSet) return false
        innerSet.add(`val`)
        return true
    }

    fun remove(`val`: Int): Boolean {
        if (`val` !in innerSet) return false
        innerSet.remove(`val`)
        return true
    }

    fun getRandom(): Int {
        return innerSet.random()
    }

}
