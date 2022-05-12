
/*
Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.

You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers, output all of them with no order requirement.
*/

fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
    val map = HashMap<String, Int>()
    list1.forEachIndexed { idx, value -> map[value] = idx }
        
    var currMin = Int.MAX_VALUE
    val currRes = LinkedList<String>()
    list2.forEachIndexed { idx, value -> 
        if (map[value] != null) {
            val sum = idx + map[value]!!
            if (sum == currMin) currRes.add(value)
            if (sum < currMin) {
                currRes.clear()
                currRes.add(value)
                currMin = sum
            }
        }
    }
    return currRes.toTypedArray()
}